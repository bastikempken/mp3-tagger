package de.kempkensebastian.mp3tagger.gui.controller;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import de.kempkensebastian.mp3tagger.enums.ID3Tag;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagAfter;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagBefore;

/**
 * @author Sebastian Kempken
 * @param <R> Controller Type
 */
@Component
public class ControllerProcessor {

    private static final Function<Method, MethodHandle> FUNCTION_TO_METHOD_HANDLE = method -> {
        try {
            return MethodHandles.lookup().unreflect(method);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    };

    /**
     * @param controller The Controller whichs Methods should be parsed
     * @return Map<T, MethodHandle> where <code>T extends ID3Tag</code> is the key, and the value is a {@link MethodHandle} of
     *         the method, the annotation belongs to
     */
    @SuppressWarnings("unchecked")
    public <T extends ID3Tag> Map<T, MethodHandle> parseGetterBefore(ID3v1Controller controller) {
        Method[] declaredMethods = controller.getClass().getDeclaredMethods();
        return Arrays.stream(declaredMethods).filter(t -> t.isAnnotationPresent(TagBefore.class))
            .collect(Collectors.toMap(m -> (T) (m.getAnnotation(TagBefore.class).iD3v1()), FUNCTION_TO_METHOD_HANDLE));

    }

    /**
     * @param controller The Controller whichs Methods should be parsed
     * @return Map<T, MethodHandle> where <code>T extends ID3Tag</code> is the key, and the value is a {@link MethodHandle} of
     *         the method, the annotation belongs to
     */
    @SuppressWarnings("unchecked")
    public <T extends ID3Tag> Map<T, MethodHandle> parseGetterAfter(ID3v1Controller controller) {
        Method[] declaredMethods = controller.getClass().getDeclaredMethods();
        return Arrays.stream(declaredMethods).filter(t -> t.isAnnotationPresent(TagAfter.class))
            .collect(Collectors.toMap(m -> (T) (m.getAnnotation(TagAfter.class).iD3v1()), FUNCTION_TO_METHOD_HANDLE));

    }

    @SuppressWarnings("unchecked")
    public <T extends ID3Tag> Map<T, MethodHandle> parseGetterBefore(ID3v2Controller controller) {
        Method[] declaredMethods = controller.getClass().getDeclaredMethods();
        return Arrays.stream(declaredMethods).filter(t -> t.isAnnotationPresent(TagBefore.class))
            .collect(Collectors.toMap(m -> (T) (m.getAnnotation(TagBefore.class).iD3v2()), FUNCTION_TO_METHOD_HANDLE));
    }

    @SuppressWarnings("unchecked")
    public <T extends ID3Tag> Map<T, MethodHandle> parseGetterAfter(ID3v2Controller controller) {
        Method[] declaredMethods = controller.getClass().getDeclaredMethods();
        return Arrays.stream(declaredMethods).filter(t -> t.isAnnotationPresent(TagAfter.class))
            .collect(Collectors.toMap(m -> (T) (m.getAnnotation(TagAfter.class).iD3v2()), FUNCTION_TO_METHOD_HANDLE));
    }
}
