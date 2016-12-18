package de.kempkensebastian.mp3tagger.services;

import java.nio.file.FileSystems;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class FilePathService {

    private static final int INDEX_FILE_NAME_WITHOUT_PATH = 0;

    private static final int INDEX_FILE_ENDING_WITHOUT_PATH = 1;

    private static final String FILE_ENDING_SEPARATOR = "\\.";

    public static final int INDEX_PATH = 0;

    public static final int INDEX_FILE_NAME = 1;

    public static final int INDEX_FILE_ENDING = 2;

    public String[] seperateFileNameFromPath(String absolutePath) {
        if (StringUtils.isNoneBlank(absolutePath)) {
            String[] result = new String[3];
            String[] split = absolutePath.split(FileSystems.getDefault().getSeparator());
            if (ArrayUtils.isNotEmpty(split)) {
                result[INDEX_PATH] = separatePath(split);
                result[INDEX_FILE_ENDING_WITHOUT_PATH] = separateFileName(split[split.length - 1]);
                result[INDEX_FILE_ENDING] = separateFileEnding(split[split.length - 1]);
            }
            return result;
        }
        return new String[] {};

    }

    private String separatePath(String[] split) {
        String path = StringUtils.EMPTY;
        for (int i = 0; i < split.length - 1; ++i) {
            path = path + split[i] + FileSystems.getDefault().getSeparator();
        }
        return path;
    }

    private String separateFileEnding(String fileName) {
        return fileName.split(FILE_ENDING_SEPARATOR)[INDEX_FILE_ENDING_WITHOUT_PATH];
    }

    private String separateFileName(String fileName) {
        return fileName.split(FILE_ENDING_SEPARATOR)[INDEX_FILE_NAME_WITHOUT_PATH];
    }

}
