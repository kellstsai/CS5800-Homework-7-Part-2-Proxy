package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProxyServer proxy = new ProxyServer();

        proxy.addSong(new Song(1, "Black Dog", "Taylor Swift", "Tortured Poets Department", 238));
        proxy.addSong(new Song(2, "we can't be friends (wait for your love)", "Ariana Grande", "eternal sunshine", 229));
        proxy.addSong(new Song(3, "Raging Fire", "Phillip Phillips", "Behind The Light", 235));
        proxy.addSong(new Song(4, "Family Line", "Conan Gray", "Superache", 216));
        proxy.addSong(new Song(5, "Saturn", "Sleeping At Last", "Atlas: I", 290));
        proxy.addSong(new Song(6, "Disenchanted", "My Chemical Romance", "The Black Parade", 239));
        proxy.addSong(new Song(7, "Atlantis", "Seafret", "Tell Me It's Real", 229));
        proxy.addSong(new Song(8, "Little Talks", "Of Monsters and Men", "My Head Is An Animal", 267));
        proxy.addSong(new Song(9, "Everything Goes On", "Porter Robinson", "Everything Goes On", 203));
        proxy.addSong(new Song(10, "Glimpse Of Us", "Joji", "Glimpse Of Us", 233));

        System.out.println("========== SONG ID ==========");
        System.out.println("Searching by Song ID: " + proxy.searchByID(1));
        System.out.println("Searching by Song ID: " + proxy.searchByID(2));
        System.out.println("Searching by Song ID: " + proxy.searchByID(3));
        System.out.println("Searching by Song ID: " + proxy.searchByID(4));
        System.out.println("Searching by Song ID: " + proxy.searchByID(5));
        System.out.println("Searching by Song ID: " + proxy.searchByID(6));
        System.out.println("Searching by Song ID: " + proxy.searchByID(7));
        System.out.println("Searching by Song ID: " + proxy.searchByID(8));
        System.out.println("Searching by Song ID: " + proxy.searchByID(9));
        System.out.println("Searching by Song ID: " + proxy.searchByID(10));


        System.out.println("");
        System.out.println("********** SONG TITLE **********");
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Saturn"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Family Line"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Raging FIre"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("we can't be friends (wait for your love)"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Black Dog"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Disenchanted"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Glimpse Of Us"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Atlantis"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Everything Goes On"));
        System.out.println("Searching by Song Title: " + proxy.searchByTitle("Little Talks"));

        System.out.println("");
        System.out.println("########## SONG ALBUM ##########");
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("eternal sunshine"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Behind The Light"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Atlas: I"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Superache"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Tortured Poets Department"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Glimpse Of Us"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("The Black Parade"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("My Head Is An Animal"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Tell Me It's Real"));
        System.out.println("Searching by Song Album: " + proxy.searchByAlbum("Everything Goes On"));

    }
}