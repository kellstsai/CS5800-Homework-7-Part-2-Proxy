package com.example;

public class Song {
    public Integer songID;
    public String title;
    public String artist;
    public String album;
    public int duration;

    public Song(Integer songID, String title, String artist, String album, int duration) {
        this.songID = songID;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }
    
    public Integer getSongID() {
        return songID;
    }

    public String getTitle() {
        return title; 
    }

    public String getAlbum() {
        return album; 
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration; 
    }

    public void setSongID(Integer songID) {
        this.songID = songID; 
    }

    public void setTitle(String title) {
        this.title = title; 
    }

    public void setAlbum(String album) {
        this.album = album; 
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration; 
    }

    @Override
    public String toString() {
        return "Song information: " +
                "Song Title: " + title + '\'' +
                ", Artist: " + artist + '\'' +
                ", Album: '" + album + '\'' +
                ", Duration: " + duration +
                '}';
    }
}
