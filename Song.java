package rockcountdown;

import static sbcc.Core.*;

import java.io.*;
import java.util.List;

public class Song {
	int rank;
	String title;
	String artist;

	public Song(int rank, String title, String artist) {
		super();
		this.rank = rank;
		this.title = title;
		this.artist = artist;
	}


	public Song(String line) {
		super();
		// List<String> lines = readFileAsLines(allSongs);
		// for (String token : line) {
		String[] tokens = line.split("\t");
		rank = parseInt(tokens[0]);
		title = tokens[1];
		artist = tokens[2];
		// }
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}

}
