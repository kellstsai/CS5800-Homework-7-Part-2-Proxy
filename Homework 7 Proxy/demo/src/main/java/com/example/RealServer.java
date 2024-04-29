package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RealServer implements SongService {
    public Map<Integer, Song> songs;

    public RealServer() {
        songs = new HashMap<>();
    }

    public void addSong(Song song) {
        songs.put(song.getSongID(), song);
    }

    @Override
    public Song searchByID(Integer songID) {
        simulateServerDelay();
        return songs.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        simulateServerDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        simulateServerDelay();
        List<Song> result = new ArrayList<>();
        for (Song song : songs.values()) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }

    private void simulateServerDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

