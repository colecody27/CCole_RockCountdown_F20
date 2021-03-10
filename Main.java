package rockcountdown;

import static sbcc.Core.*;

import java.io.*;
import java.util.*;

import static java.lang.System.*;

/**
 * 
 * @author Cody Cole
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = readLine();
		List<String> lines = readFileAsLines(fileName);
		ArrayList<Song> songs = new ArrayList();
		for (var line : lines) {
			String[] tokens = line.split("\t");
			Song newSong = new Song(parseInt(tokens[0]), tokens[1], tokens[2]);
			songs.add(newSong);
		}
		StringBuilder sb = new StringBuilder();
		for (var i = songs.size(); i > 0; i--) {
			sb.append(songs.get(i - 1).rank + "\t" + songs.get(i - 1).title + "\r\n"); // Might need to change for OS
		}
		println(sb);
		println("Complete");
	}

}
