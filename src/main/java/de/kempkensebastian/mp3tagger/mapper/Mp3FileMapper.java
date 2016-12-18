package de.kempkensebastian.mp3tagger.mapper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mpatric.mp3agic.Mp3File;
import de.kempkensebastian.mp3tagger.datamodel.TagFile;
import de.kempkensebastian.mp3tagger.datamodel.access.DataModelAccess;
import de.kempkensebastian.mp3tagger.enums.ID3v1;
import de.kempkensebastian.mp3tagger.enums.ID3v2;
import de.kempkensebastian.mp3tagger.services.FilePathService;

@Component
public class Mp3FileMapper {

    @Autowired
    private FilePathService filePathService;

    public void mapMp3FileToMp3TaggingFile(Mp3File mp3File, TagFile mp3TaggingFile) {
        String[] filePath = filePathService.seperateFileNameFromPath(mp3File.getFilename());
        mp3TaggingFile
            .setFileName(filePath[FilePathService.INDEX_FILE_NAME] + "." + filePath[FilePathService.INDEX_FILE_ENDING]);

        mapId3v1(mp3File, mp3TaggingFile);
        mapId3v2(mp3File, mp3TaggingFile);
    }

    private void mapId3v2(Mp3File mp3File, TagFile mp3TaggingFile) {
        if (mp3File.hasId3v2Tag()) {
            mp3TaggingFile.setiD3v2Present(true);
            com.mpatric.mp3agic.ID3v2 id3v2Tag = mp3File.getId3v2Tag();

            // Before
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ALBUM,
                StringUtils.defaultString(id3v2Tag.getAlbum()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ALBUM_ARTIST,
                StringUtils.defaultString(id3v2Tag.getAlbumArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ARTIST,
                StringUtils.defaultString(id3v2Tag.getArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ARTIST_URL,
                StringUtils.defaultString(id3v2Tag.getArtistUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.AUDIO_FILE_URL,
                StringUtils.defaultString(id3v2Tag.getAudiofileUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.AUDIO_SOURCE_URL,
                StringUtils.defaultString(id3v2Tag.getAudioSourceUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.BPM, String.valueOf(id3v2Tag.getBPM()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.COMMENT,
                StringUtils.defaultString(id3v2Tag.getComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.COMMERCIAL_URL,
                StringUtils.defaultString(id3v2Tag.getCommercialUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.COMPOSER,
                StringUtils.defaultString(id3v2Tag.getComposer()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.COPYRIGHT,
                StringUtils.defaultString(id3v2Tag.getCopyright()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.COPYRIGHT_URL,
                StringUtils.defaultString(id3v2Tag.getCopyrightUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.DATE,
                StringUtils.defaultString(id3v2Tag.getDate()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ENCODER,
                StringUtils.defaultString(id3v2Tag.getEncoder()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.GENRE, String.valueOf(id3v2Tag.getGenre()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.GENRE_DESCRIPTION,
                StringUtils.defaultString(id3v2Tag.getGenreDescription()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.GROUPING,
                StringUtils.defaultString(id3v2Tag.getGrouping()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ITUNES_COMMENT,
                StringUtils.defaultString(id3v2Tag.getItunesComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.KEY,
                StringUtils.defaultString(id3v2Tag.getKey()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.ORIGINAL_ARTIST,
                StringUtils.defaultString(id3v2Tag.getOriginalArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.PADDING,
                String.valueOf(id3v2Tag.getPadding()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.PART_OF_SET,
                StringUtils.defaultString(id3v2Tag.getPartOfSet()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.PAYMENT_URL,
                StringUtils.defaultString(id3v2Tag.getPaymentUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.PUBLISHER,
                StringUtils.defaultString(id3v2Tag.getPublisher()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.PUBLISHER_URL,
                StringUtils.defaultString(id3v2Tag.getPublisherUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.RADIOSTATION_URL,
                StringUtils.defaultString(id3v2Tag.getRadiostationUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.TITLE,
                StringUtils.defaultString(id3v2Tag.getTitle()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.TRACK,
                StringUtils.defaultString(id3v2Tag.getTrack()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.URL,
                StringUtils.defaultString(id3v2Tag.getUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v2.YEAR,
                StringUtils.defaultString(id3v2Tag.getYear()));

            // After
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ALBUM,
                StringUtils.defaultString(id3v2Tag.getAlbum()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ALBUM_ARTIST,
                StringUtils.defaultString(id3v2Tag.getAlbumArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ARTIST,
                StringUtils.defaultString(id3v2Tag.getArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ARTIST_URL,
                StringUtils.defaultString(id3v2Tag.getArtistUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.AUDIO_FILE_URL,
                StringUtils.defaultString(id3v2Tag.getAudiofileUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.AUDIO_SOURCE_URL,
                StringUtils.defaultString(id3v2Tag.getAudioSourceUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.BPM, String.valueOf(id3v2Tag.getBPM()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.COMMENT,
                StringUtils.defaultString(id3v2Tag.getComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.COMMERCIAL_URL,
                StringUtils.defaultString(id3v2Tag.getCommercialUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.COMPOSER,
                StringUtils.defaultString(id3v2Tag.getComposer()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.COPYRIGHT,
                StringUtils.defaultString(id3v2Tag.getCopyright()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.COPYRIGHT_URL,
                StringUtils.defaultString(id3v2Tag.getCopyrightUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.DATE,
                StringUtils.defaultString(id3v2Tag.getDate()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ENCODER,
                StringUtils.defaultString(id3v2Tag.getEncoder()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.GENRE, String.valueOf(id3v2Tag.getGenre()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.GENRE_DESCRIPTION,
                StringUtils.defaultString(id3v2Tag.getGenreDescription()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.GROUPING,
                StringUtils.defaultString(id3v2Tag.getGrouping()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ITUNES_COMMENT,
                StringUtils.defaultString(id3v2Tag.getItunesComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.KEY,
                StringUtils.defaultString(id3v2Tag.getKey()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.ORIGINAL_ARTIST,
                StringUtils.defaultString(id3v2Tag.getOriginalArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.PADDING,
                String.valueOf(id3v2Tag.getPadding()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.PART_OF_SET,
                StringUtils.defaultString(id3v2Tag.getPartOfSet()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.PAYMENT_URL,
                StringUtils.defaultString(id3v2Tag.getPaymentUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.PUBLISHER,
                StringUtils.defaultString(id3v2Tag.getPublisher()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.PUBLISHER_URL,
                StringUtils.defaultString(id3v2Tag.getPublisherUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.RADIOSTATION_URL,
                StringUtils.defaultString(id3v2Tag.getRadiostationUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.TITLE,
                StringUtils.defaultString(id3v2Tag.getTitle()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.TRACK,
                StringUtils.defaultString(id3v2Tag.getTrack()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.URL,
                StringUtils.defaultString(id3v2Tag.getUrl()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v2.YEAR,
                StringUtils.defaultString(id3v2Tag.getYear()));
        } else {
            mp3TaggingFile.setiD3v2Present(false);
        }
    }

    private void mapId3v1(Mp3File mp3File, TagFile mp3TaggingFile) {
        if (mp3File.hasId3v1Tag()) {
            mp3TaggingFile.setiD3v1Present(true);
            com.mpatric.mp3agic.ID3v1 id3v1Tag = mp3File.getId3v1Tag();

            // Before
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.ALBUM,
                StringUtils.defaultString(id3v1Tag.getAlbum()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.ARTIST,
                StringUtils.defaultString(id3v1Tag.getArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.COMMENT,
                StringUtils.defaultString(id3v1Tag.getComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.GENRE, String.valueOf(id3v1Tag.getGenre()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.GENRE_DESCRIPTION,
                StringUtils.defaultString(id3v1Tag.getGenreDescription()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.TITLE,
                StringUtils.defaultString(id3v1Tag.getTitle()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.TRACK,
                StringUtils.defaultString(id3v1Tag.getTrack()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.VERSION,
                StringUtils.defaultString(id3v1Tag.getVersion()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagBeforeTagging(ID3v1.YEAR,
                StringUtils.defaultString(id3v1Tag.getYear()));

            // After
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.ALBUM,
                StringUtils.defaultString(id3v1Tag.getAlbum()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.ARTIST,
                StringUtils.defaultString(id3v1Tag.getArtist()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.COMMENT,
                StringUtils.defaultString(id3v1Tag.getComment()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.GENRE, String.valueOf(id3v1Tag.getGenre()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.GENRE_DESCRIPTION,
                StringUtils.defaultString(id3v1Tag.getGenreDescription()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.TITLE,
                StringUtils.defaultString(id3v1Tag.getTitle()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.TRACK,
                StringUtils.defaultString(id3v1Tag.getTrack()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.VERSION,
                StringUtils.defaultString(id3v1Tag.getVersion()));
            DataModelAccess.of(mp3TaggingFile.getData()).setTagAfterTagging(ID3v1.YEAR,
                StringUtils.defaultString(id3v1Tag.getYear()));
        } else {
            mp3TaggingFile.setiD3v1Present(false);
        }
    }

}
