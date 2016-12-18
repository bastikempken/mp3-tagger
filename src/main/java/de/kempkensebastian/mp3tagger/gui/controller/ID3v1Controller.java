package de.kempkensebastian.mp3tagger.gui.controller;

import org.springframework.stereotype.Component;

import de.kempkensebastian.mp3tagger.enums.ID3v1;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagAfter;
import de.kempkensebastian.mp3tagger.gui.controlleroperation.TagBefore;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

@Component
public class ID3v1Controller {
	
	@FXML
	private TextField albumAfterTagging;

	@FXML
	private TextField albumBeforeTagging;

	@FXML
	private TextField artistBeforeTagging;
	
	@FXML
	private TextField artistAfterTagging;
	
	@FXML
	private TextField commentBeforeTagging;
	
	@FXML
	private TextField commentAfterTagging;
	
	@FXML
	private TextField genreBeforeTagging;
	
	@FXML
	private TextField genreAfterTagging;
	
	@FXML
	private TextField genreDescriptionBeforeTagging;

	@FXML
	private TextField genreDescriptionAfterTagging;
	
	@FXML
	private TextField titleBeforeTagging;
	
	@FXML
	private TextField titleAfterTagging;
	
	@FXML
	private TextField trackBeforeTagging;
	
	@FXML
	private TextField trackAfterTagging;
	
	@FXML
	private TextField versionBeforeTagging;
	
	@FXML
	private TextField versionAfterTagging;
	
	@FXML
	private TextField yearBeforeTagging;

	@FXML
	private TextField yearAfterTagging;

	@TagBefore(iD3v1=ID3v1.ALBUM)
	public TextField getAlbumBeforeTagging() {
		return albumBeforeTagging;
	}

	public void setAlbumBeforeTagging(TextField albumBeforeTagging) {
		this.albumBeforeTagging = albumBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.ALBUM)
	public TextField getAlbumAfterTagging() {
		return albumAfterTagging;
	}

	public void setAlbumAfterTagging(TextField albumAfterTagging) {
		this.albumAfterTagging = albumAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.ARTIST)
	public TextField getArtistBeforeTagging() {
		return artistBeforeTagging;
	}

	public void setArtistBeforeTagging(TextField artistBeforeTagging) {
		this.artistBeforeTagging = artistBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.ARTIST)
	public TextField getArtistAfterTagging() {
		return artistAfterTagging;
	}

	public void setArtistAfterTagging(TextField artistAfterTagging) {
		this.artistAfterTagging = artistAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.COMMENT)
	public TextField getCommentBeforeTagging() {
		return commentBeforeTagging;
	}

	public void setCommentBeforeTagging(TextField commentBeforeTagging) {
		this.commentBeforeTagging = commentBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.COMMENT)
	public TextField getCommentAfterTagging() {
		return commentAfterTagging;
	}

	public void setCommentAfterTagging(TextField commentAfterTagging) {
		this.commentAfterTagging = commentAfterTagging;
	}


	@TagBefore(iD3v1=ID3v1.GENRE)
	public TextField getGenreBeforeTagging() {
		return genreBeforeTagging;
	}

	public void setGenreBeforeTagging(TextField genreBeforeTagging) {
		this.genreBeforeTagging = genreBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.GENRE)
	public TextField getGenreAfterTagging() {
		return genreAfterTagging;
	}

	public void setGenreAfterTagging(TextField genreAfterTagging) {
		this.genreAfterTagging = genreAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.GENRE_DESCRIPTION)
	public TextField getGenreDescriptionBeforeTagging() {
		return genreDescriptionBeforeTagging;
	}

	public void setGenreDescriptionBeforeTagging(TextField genreDescriptionBeforeTagging) {
		this.genreDescriptionBeforeTagging = genreDescriptionBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.GENRE_DESCRIPTION)
	public TextField getGenreDescriptionAfterTagging() {
		return genreDescriptionAfterTagging;
	}

	public void setGenreDescriptionAfterTagging(TextField genreDescriptionAfterTagging) {
		this.genreDescriptionAfterTagging = genreDescriptionAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.TITLE)
	public TextField getTitleBeforeTagging() {
		return titleBeforeTagging;
	}

	public void setTitleBeforeTagging(TextField titleBeforeTagging) {
		this.titleBeforeTagging = titleBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.TITLE)
	public TextField getTitleAfterTagging() {
		return titleAfterTagging;
	}

	public void setTitleAfterTagging(TextField titleAfterTagging) {
		this.titleAfterTagging = titleAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.TRACK)
	public TextField getTrackBeforeTagging() {
		return trackBeforeTagging;
	}

	public void setTrackBeforeTagging(TextField trackBeforeTagging) {
		this.trackBeforeTagging = trackBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.TRACK)
	public TextField getTrackAfterTagging() {
		return trackAfterTagging;
	}

	public void setTrackAfterTagging(TextField trackAfterTagging) {
		this.trackAfterTagging = trackAfterTagging;
	}

	@TagBefore(iD3v1=ID3v1.VERSION)
	public TextField getVersionBeforeTagging() {
		return versionBeforeTagging;
	}

	public void setVersionBeforeTagging(TextField versionBeforeTagging) {
		this.versionBeforeTagging = versionBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.VERSION)
	public TextField getVersionAfterTagging() {
		return versionAfterTagging;
	}

	public void setVersionAfterTagging(TextField versionAfterTagging) {
		this.versionAfterTagging = versionAfterTagging;
	}


	@TagBefore(iD3v1=ID3v1.YEAR)
	public TextField getYearBeforeTagging() {
		return yearBeforeTagging;
	}

	public void setYearBeforeTagging(TextField yearBeforeTagging) {
		this.yearBeforeTagging = yearBeforeTagging;
	}

	@TagAfter(iD3v1=ID3v1.YEAR)
	public TextField getYearAfterTagging() {
		return yearAfterTagging;
	}

	public void setYearAfterTagging(TextField yearAfterTagging) {
		this.yearAfterTagging = yearAfterTagging;
	}
}
