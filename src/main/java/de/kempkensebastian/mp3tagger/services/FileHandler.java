package de.kempkensebastian.mp3tagger.services;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

@Component
public class FileHandler {

    private static final String MP3_FILE_ENDING = "MP3";

    private static final Logger LOGGER = LogManager.getLogger(FileHandler.class);

    private static final Function<File, Mp3File> FILE_TO_MP3_FILE = new Function<File, Mp3File>() {

        @Override
        public Mp3File apply(File file) {
            try {
                return new Mp3File(file);
            } catch (UnsupportedTagException | InvalidDataException | IOException e) {
                LOGGER.error("Error while reading MP3-File", e);
            }
            return null;
        }
    };

    @Autowired
    private FilePathService filePathService;

    public List<Mp3File> readDirectory(String path) {

        File directory = new File(path);

        File[] files = directory.listFiles();

        if (files != null) {
            Arrays.stream(files).forEach(f -> LOGGER.info(f.getName()));
            //
        }

        List<Mp3File> collect = Arrays.stream(files)//
            .filter(f -> FilenameUtils.getExtension(f.getAbsolutePath()).equalsIgnoreCase(MP3_FILE_ENDING))//
            .map(FILE_TO_MP3_FILE)//
            .filter(Objects::nonNull)//
            .collect(Collectors.toList());
        return collect;
    }

    public boolean containsConvertableFiles(String path) {
        File directory = new File(path);
        File[] files = directory.listFiles();

        if (files == null) {
            //
        }

        Long size = Arrays.stream(files)
            .map(file -> filePathService.seperateFileNameFromPath(file.getAbsolutePath())[FilePathService.INDEX_FILE_ENDING])
            .map(String::toUpperCase).filter(s -> s.equals(MP3_FILE_ENDING)).collect(Collectors.counting());

        return size > 0;
    }

}
