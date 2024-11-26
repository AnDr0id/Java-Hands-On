package com.JosephSumsion.handson6;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SongList {
	public static void main(String[] args) {
        String[] songs = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};

        // Create a StringBuilder to store the song list
        StringBuilder songList = new StringBuilder();

        // Iterate over the songs array and append each song to the StringBuilder
        for (int i = 0; i < songs.length; i++) {
            songList.append(songs[i]);
            if (i < songs.length - 1) {
                songList.append(", ");
            }
        }

        // Write the song list to a file named "songs.txt"
        try (FileWriter writer = new FileWriter("songs.txt")) {
            writer.write(songList.toString());
            System.out.println("Song list written to songs.txt successfully.");
        } catch (IOException e) {
            System.err.println("Error when writing songs.txt: " + e.getMessage());
            e.printStackTrace();
        }

        // Read the contents of the file and print it to the console
        try {
            String fileContent = Files.readString(Paths.get("songs.txt"));
            System.out.println("Contents of songs.txt:");
            System.out.println(fileContent);
        } catch (IOException e) {
            System.err.println("Error when reading songs.txt: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

