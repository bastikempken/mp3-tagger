package de.kempkensebastian.mp3tagger.gui.controller;

import org.springframework.stereotype.Component;
import de.kempkensebastian.mp3tagger.enums.ID3v2;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagAfter;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagBefore;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

@Component
public class ID3v2Controller {

    @FXML
    private TextField paddingBeforeTagging;

    @FXML
    private TextField paddingAfterTagging;

    @FXML
    private TextField trackBeforeTagging;

    @FXML
    private TextField trackAfterTagging;

    @FXML
    private TextField partOfSetBeforeTagging;

    @FXML
    private TextField partOfSetAfterTagging;

    @FXML
    private TextField groupingBeforeTagging;

    @FXML
    private TextField groupingAfterTagging;

    @FXML
    private TextField artistBeforeTagging;

    @FXML
    private TextField artistAfterTagging;

    @FXML
    private TextField albumArtistBeforeTagging;

    @FXML
    private TextField albumArtistAfterTagging;

    @FXML
    private TextField titleBeforeTagging;

    @FXML
    private TextField tileAfterTagging;

    @FXML
    private TextField albumBeforeTagging;

    @FXML
    private TextField albumAfterTagging;

    @FXML
    private TextField yearBeforeTagging;

    @FXML
    private TextField yearAfterTagging;

    @FXML
    private TextField dateBeforeTagging;

    @FXML
    private TextField dateAfterTagging;

    @FXML
    private TextField genreBeforeTagging;

    @FXML
    private TextField genreAfterTagging;

    @FXML
    private TextField bpmBeforeTagging;

    @FXML
    private TextField bpmAfterTagging;

    @FXML
    private TextField keyBeforeTagging;

    @FXML
    private TextField keyAfterTagging;

    @FXML
    private TextField genreDecriptionBeforeTagging;

    @FXML
    private TextField genreDecriptionAfterTagging;

    @FXML
    private TextField commentBeforeTagging;

    @FXML
    private TextField commentAfterTagging;

    @FXML
    private TextField itunesCommentBeforeTagging;

    @FXML
    private TextField itunesCommentAfterTagging;

    @FXML
    private TextField composerBeforeTagging;

    @FXML
    private TextField composerAfterTagging;

    @FXML
    private TextField publisherBeforeTagging;

    @FXML
    private TextField publisherAfterTagging;

    @FXML
    private TextField originalArtistBeforeTagging;

    @FXML
    private TextField originalArtistAfterTagging;

    @FXML
    private TextField copyrightBeforeTagging;

    @FXML
    private TextField copyrightAfterTagging;

    @FXML
    private TextField artistUrlBeforeTagging;

    @FXML
    private TextField artistUrlAfterTagging;

    @FXML
    private TextField commercialUrlBeforeTagging;

    @FXML
    private TextField commercialUrlAfterTagging;

    @FXML
    private TextField copyrightUrlBeforeTagging;

    @FXML
    private TextField copyrightUrlAfterTagging;

    @FXML
    private TextField audioFileUrlBeforeTagging;

    @FXML
    private TextField audioFileUrlAfterTagging;

    @FXML
    private TextField audioSourceUrlBeforeTagging;

    @FXML
    private TextField audioSourceUrlAfterTagging;

    @FXML
    private TextField radiostationUrlBeforeTagging;

    @FXML
    private TextField radiostationUrlAfterTagging;

    @FXML
    private TextField paymentUrlBeforeTagging;

    @FXML
    private TextField paymentUrlAfterTagging;

    @FXML
    private TextField publisherUrlBeforeTagging;

    @FXML
    private TextField publisherUrlAfterTagging;

    @FXML
    private TextField urlBeforeTagging;

    @FXML
    private TextField urlAfterTagging;

    @FXML
    private TextField encoderBeforeTagging;

    @FXML
    private TextField encoderAfterTagging;

    @TagBefore(iD3v2 = ID3v2.PADDING)
    public TextField getPaddingBeforeTagging() {
        return paddingBeforeTagging;
    }

    public void setPaddingBeforeTagging(TextField paddingBeforeTagging) {
        this.paddingBeforeTagging = paddingBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.PADDING)
    public TextField getPaddingAfterTagging() {
        return paddingAfterTagging;
    }

    public void setPaddingAfterTagging(TextField paddingAfterTagging) {
        this.paddingAfterTagging = paddingAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.TRACK)
    public TextField getTrackBeforeTagging() {
        return trackBeforeTagging;
    }

    public void setTrackBeforeTagging(TextField trackBeforeTagging) {
        this.trackBeforeTagging = trackBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.TRACK)
    public TextField getTrackAfterTagging() {
        return trackAfterTagging;
    }

    public void setTrackAfterTagging(TextField trackAfterTagging) {
        this.trackAfterTagging = trackAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.PART_OF_SET)
    public TextField getPartOfSetBeforeTagging() {
        return partOfSetBeforeTagging;
    }

    public void setPartOfSetBeforeTagging(TextField partOfSetBeforeTagging) {
        this.partOfSetBeforeTagging = partOfSetBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.PART_OF_SET)
    public TextField getPartOfSetAfterTagging() {
        return partOfSetAfterTagging;
    }

    public void setPartOfSetAfterTagging(TextField partOfSetAfterTagging) {
        this.partOfSetAfterTagging = partOfSetAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.GROUPING)
    public TextField getGroupingBeforeTagging() {
        return groupingBeforeTagging;
    }

    public void setGroupingBeforeTagging(TextField groupingBeforeTagging) {
        this.groupingBeforeTagging = groupingBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.GROUPING)
    public TextField getGroupingAfterTagging() {
        return groupingAfterTagging;
    }

    public void setGroupingAfterTagging(TextField groupingAfterTagging) {
        this.groupingAfterTagging = groupingAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ARTIST)
    public TextField getArtistBeforeTagging() {
        return artistBeforeTagging;
    }

    public void setArtistBeforeTagging(TextField artistBeforeTagging) {
        this.artistBeforeTagging = artistBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ARTIST)
    public TextField getArtistAfterTagging() {
        return artistAfterTagging;
    }

    public void setArtistAfterTagging(TextField artistAfterTagging) {
        this.artistAfterTagging = artistAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ALBUM_ARTIST)
    public TextField getAlbumArtistBeforeTagging() {
        return albumArtistBeforeTagging;
    }

    public void setAlbumArtistBeforeTagging(TextField albumArtistBeforeTagging) {
        this.albumArtistBeforeTagging = albumArtistBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ALBUM_ARTIST)
    public TextField getAlbumArtistAfterTagging() {
        return albumArtistAfterTagging;
    }

    public void setAlbumArtistAfterTagging(TextField albumArtistAfterTagging) {
        this.albumArtistAfterTagging = albumArtistAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.TITLE)
    public TextField getTitleBeforeTagging() {
        return titleBeforeTagging;
    }

    public void setTitleBeforeTagging(TextField titleBeforeTagging) {
        this.titleBeforeTagging = titleBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.TITLE)
    public TextField getTileAfterTagging() {
        return tileAfterTagging;
    }

    public void setTileAfterTagging(TextField tileAfterTagging) {
        this.tileAfterTagging = tileAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ALBUM)
    public TextField getAlbumBeforeTagging() {
        return albumBeforeTagging;
    }

    public void setAlbumBeforeTagging(TextField albumBeforeTagging) {
        this.albumBeforeTagging = albumBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ALBUM)
    public TextField getAlbumAfterTagging() {
        return albumAfterTagging;
    }

    public void setAlbumAfterTagging(TextField albumAfterTagging) {
        this.albumAfterTagging = albumAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.YEAR)
    public TextField getYearBeforeTagging() {
        return yearBeforeTagging;
    }

    public void setYearBeforeTagging(TextField yearBeforeTagging) {
        this.yearBeforeTagging = yearBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.YEAR)
    public TextField getYearAfterTagging() {
        return yearAfterTagging;
    }

    public void setYearAfterTagging(TextField yearAfterTagging) {
        this.yearAfterTagging = yearAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.DATE)
    public TextField getDateBeforeTagging() {
        return dateBeforeTagging;
    }

    public void setDateBeforeTagging(TextField dateBeforeTagging) {
        this.dateBeforeTagging = dateBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.DATE)
    public TextField getDateAfterTagging() {
        return dateAfterTagging;
    }

    public void setDateAfterTagging(TextField dateAfterTagging) {
        this.dateAfterTagging = dateAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.GENRE)
    public TextField getGenreBeforeTagging() {
        return genreBeforeTagging;
    }

    public void setGenreBeforeTagging(TextField genreBeforeTagging) {
        this.genreBeforeTagging = genreBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.GENRE)
    public TextField getGenreAfterTagging() {
        return genreAfterTagging;
    }

    public void setGenreAfterTagging(TextField genreAfterTagging) {
        this.genreAfterTagging = genreAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.BPM)
    public TextField getBpmBeforeTagging() {
        return bpmBeforeTagging;
    }

    public void setBpmBeforeTagging(TextField bpmBeforeTagging) {
        this.bpmBeforeTagging = bpmBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.BPM)
    public TextField getBpmAfterTagging() {
        return bpmAfterTagging;
    }

    public void setBpmAfterTagging(TextField bpmAfterTagging) {
        this.bpmAfterTagging = bpmAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.KEY)
    public TextField getKeyBeforeTagging() {
        return keyBeforeTagging;
    }

    public void setKeyBeforeTagging(TextField keyBeforeTagging) {
        this.keyBeforeTagging = keyBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.KEY)
    public TextField getKeyAfterTagging() {
        return keyAfterTagging;
    }

    public void setKeyAfterTagging(TextField keyAfterTagging) {
        this.keyAfterTagging = keyAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.GENRE_DESCRIPTION)
    public TextField getGenreDecriptionBeforeTagging() {
        return genreDecriptionBeforeTagging;
    }

    public void setGenreDecriptionBeforeTagging(TextField genreDecriptionBeforeTagging) {
        this.genreDecriptionBeforeTagging = genreDecriptionBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.GENRE_DESCRIPTION)
    public TextField getGenreDecriptionAfterTagging() {
        return genreDecriptionAfterTagging;
    }

    public void setGenreDecriptionAfterTagging(TextField genreDecriptionAfterTagging) {
        this.genreDecriptionAfterTagging = genreDecriptionAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.COMMENT)
    public TextField getCommentBeforeTagging() {
        return commentBeforeTagging;
    }

    public void setCommentBeforeTagging(TextField commentBeforeTagging) {
        this.commentBeforeTagging = commentBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.COMMENT)
    public TextField getCommentAfterTagging() {
        return commentAfterTagging;
    }

    public void setCommentAfterTagging(TextField commentAfterTagging) {
        this.commentAfterTagging = commentAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ITUNES_COMMENT)
    public TextField getItunesCommentBeforeTagging() {
        return itunesCommentBeforeTagging;
    }

    public void setItunesCommentBeforeTagging(TextField itunesCommentBeforeTagging) {
        this.itunesCommentBeforeTagging = itunesCommentBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ITUNES_COMMENT)
    public TextField getItunesCommentAfterTagging() {
        return itunesCommentAfterTagging;
    }

    public void setItunesCommentAfterTagging(TextField itunesCommentAfterTagging) {
        this.itunesCommentAfterTagging = itunesCommentAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.COMPOSER)
    public TextField getComposerBeforeTagging() {
        return composerBeforeTagging;
    }

    public void setComposerBeforeTagging(TextField composerBeforeTagging) {
        this.composerBeforeTagging = composerBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.COMPOSER)
    public TextField getComposerAfterTagging() {
        return composerAfterTagging;
    }

    public void setComposerAfterTagging(TextField composerAfterTagging) {
        this.composerAfterTagging = composerAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.PUBLISHER)
    public TextField getPublisherBeforeTagging() {
        return publisherBeforeTagging;
    }

    public void setPublisherBeforeTagging(TextField publisherBeforeTagging) {
        this.publisherBeforeTagging = publisherBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.PUBLISHER)
    public TextField getPublisherAfterTagging() {
        return publisherAfterTagging;
    }

    public void setPublisherAfterTagging(TextField publisherAfterTagging) {
        this.publisherAfterTagging = publisherAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ORIGINAL_ARTIST)
    public TextField getOriginalArtistBeforeTagging() {
        return originalArtistBeforeTagging;
    }

    public void setOriginalArtistBeforeTagging(TextField originalArtistBeforeTagging) {
        this.originalArtistBeforeTagging = originalArtistBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ORIGINAL_ARTIST)
    public TextField getOriginalArtistAfterTagging() {
        return originalArtistAfterTagging;
    }

    public void setOriginalArtistAfterTagging(TextField originalArtistAfterTagging) {
        this.originalArtistAfterTagging = originalArtistAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.COPYRIGHT)
    public TextField getCopyrightBeforeTagging() {
        return copyrightBeforeTagging;
    }

    public void setCopyrightBeforeTagging(TextField copyrightBeforeTagging) {
        this.copyrightBeforeTagging = copyrightBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.COPYRIGHT)
    public TextField getCopyrightAfterTagging() {
        return copyrightAfterTagging;
    }

    public void setCopyrightAfterTagging(TextField copyrightAfterTagging) {
        this.copyrightAfterTagging = copyrightAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ARTIST_URL)
    public TextField getArtistUrlBeforeTagging() {
        return artistUrlBeforeTagging;
    }

    public void setArtistUrlBeforeTagging(TextField artistUrlBeforeTagging) {
        this.artistUrlBeforeTagging = artistUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ARTIST_URL)
    public TextField getArtistUrlAfterTagging() {
        return artistUrlAfterTagging;
    }

    public void setArtistUrlAfterTagging(TextField artistUrlAfterTagging) {
        this.artistUrlAfterTagging = artistUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.COMMERCIAL_URL)
    public TextField getCommercialUrlBeforeTagging() {
        return commercialUrlBeforeTagging;
    }

    public void setCommercialUrlBeforeTagging(TextField commercialUrlBeforeTagging) {
        this.commercialUrlBeforeTagging = commercialUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.COMMERCIAL_URL)
    public TextField getCommercialUrlAfterTagging() {
        return commercialUrlAfterTagging;
    }

    public void setCommercialUrlAfterTagging(TextField commercialUrlAfterTagging) {
        this.commercialUrlAfterTagging = commercialUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.COPYRIGHT_URL)
    public TextField getCopyrightUrlBeforeTagging() {
        return copyrightUrlBeforeTagging;
    }

    public void setCopyrightUrlBeforeTagging(TextField copyrightUrlBeforeTagging) {
        this.copyrightUrlBeforeTagging = copyrightUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.COPYRIGHT_URL)
    public TextField getCopyrightUrlAfterTagging() {
        return copyrightUrlAfterTagging;
    }

    public void setCopyrightUrlAfterTagging(TextField copyrightUrlAfterTagging) {
        this.copyrightUrlAfterTagging = copyrightUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.AUDIO_FILE_URL)
    public TextField getAudioFileUrlBeforeTagging() {
        return audioFileUrlBeforeTagging;
    }

    public void setAudioFileUrlBeforeTagging(TextField audioFileUrlBeforeTagging) {
        this.audioFileUrlBeforeTagging = audioFileUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.AUDIO_FILE_URL)
    public TextField getAudioFileUrlAfterTagging() {
        return audioFileUrlAfterTagging;
    }

    public void setAudioFileUrlAfterTagging(TextField audioFileUrlAfterTagging) {
        this.audioFileUrlAfterTagging = audioFileUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.AUDIO_SOURCE_URL)
    public TextField getAudioSourceUrlBeforeTagging() {
        return audioSourceUrlBeforeTagging;
    }

    public void setAudioSourceUrlBeforeTagging(TextField audioSourceUrlBeforeTagging) {
        this.audioSourceUrlBeforeTagging = audioSourceUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.AUDIO_SOURCE_URL)
    public TextField getAudioSourceUrlAfterTagging() {
        return audioSourceUrlAfterTagging;
    }

    public void setAudioSourceUrlAfterTagging(TextField audioSourceUrlAfterTagging) {
        this.audioSourceUrlAfterTagging = audioSourceUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.RADIOSTATION_URL)
    public TextField getRadiostationUrlBeforeTagging() {
        return radiostationUrlBeforeTagging;
    }

    public void setRadiostationUrlBeforeTagging(TextField radiostationUrlBeforeTagging) {
        this.radiostationUrlBeforeTagging = radiostationUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.RADIOSTATION_URL)
    public TextField getRadiostationUrlAfterTagging() {
        return radiostationUrlAfterTagging;
    }

    public void setRadiostationUrlAfterTagging(TextField radiostationUrlAfterTagging) {
        this.radiostationUrlAfterTagging = radiostationUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.PAYMENT_URL)
    public TextField getPaymentUrlBeforeTagging() {
        return paymentUrlBeforeTagging;
    }

    public void setPaymentUrlBeforeTagging(TextField paymentUrlBeforeTagging) {
        this.paymentUrlBeforeTagging = paymentUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.PAYMENT_URL)
    public TextField getPaymentUrlAfterTagging() {
        return paymentUrlAfterTagging;
    }

    public void setPaymentUrlAfterTagging(TextField paymentUrlAfterTagging) {
        this.paymentUrlAfterTagging = paymentUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.PUBLISHER_URL)
    public TextField getPublisherUrlBeforeTagging() {
        return publisherUrlBeforeTagging;
    }

    public void setPublisherUrlBeforeTagging(TextField publisherUrlBeforeTagging) {
        this.publisherUrlBeforeTagging = publisherUrlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.PUBLISHER_URL)
    public TextField getPublisherUrlAfterTagging() {
        return publisherUrlAfterTagging;
    }

    public void setPublisherUrlAfterTagging(TextField publisherUrlAfterTagging) {
        this.publisherUrlAfterTagging = publisherUrlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.URL)
    public TextField getUrlBeforeTagging() {
        return urlBeforeTagging;
    }

    public void setUrlBeforeTagging(TextField urlBeforeTagging) {
        this.urlBeforeTagging = urlBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.URL)
    public TextField getUrlAfterTagging() {
        return urlAfterTagging;
    }

    public void setUrlAfterTagging(TextField urlAfterTagging) {
        this.urlAfterTagging = urlAfterTagging;
    }

    @TagBefore(iD3v2 = ID3v2.ENCODER)
    public TextField getEncoderBeforeTagging() {
        return encoderBeforeTagging;
    }

    public void setEncoderBeforeTagging(TextField encoderBeforeTagging) {
        this.encoderBeforeTagging = encoderBeforeTagging;
    }

    @TagAfter(iD3v2 = ID3v2.ENCODER)
    public TextField getEncoderAfterTagging() {
        return encoderAfterTagging;
    }

    public void setEncoderAfterTagging(TextField encoderAfterTagging) {
        this.encoderAfterTagging = encoderAfterTagging;
    }
}
