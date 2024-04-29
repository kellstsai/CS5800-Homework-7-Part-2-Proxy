package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyServer implements SongService {
    public RealServer realServer;
    public Map<Integer, Song> cache;

    public ProxyServer() {
        this.realServer = new RealServer();
        this.cache = new HashMap<>();
    }

    @Override
    public Song searchByID(Integer songID) {
        Song song = cache.get(songID);
        if (song == null) {
            song = realServer.searchByID(songID);
            cache.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        return realServer.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        return realServer.searchByAlbum(album);
    }

    public void addSong(Song song) {
        realServer.addSong(song);
    }
}
