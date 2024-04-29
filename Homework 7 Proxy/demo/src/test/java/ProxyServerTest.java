import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.Song;
import com.example.ProxyServer;

public class ProxyServerTest {
    
    private ProxyServer proxyServer;

    @Before
    public void setUp() {
        proxyServer = new ProxyServer();
        proxyServer.addSong(new Song(1, "Song1", "Artist1", "Album1", 200));
        proxyServer.addSong(new Song(2, "Song2", "Artist2", "Album2", 250));
        proxyServer.addSong(new Song(3, "Song3", "Artist3", "Album3", 220));
        proxyServer.addSong(new Song(4, "Song4", "Artist4", "Album4", 180));
        proxyServer.addSong(new Song(5, "Song5", "Artist5", "Album5", 300));
    }

    @Test
    public void searchByIDTest() {
        Song foundSong = proxyServer.searchByID(3);
        assertEquals("Song3", foundSong.getTitle());
        assertEquals("Artist3", foundSong.getArtist());
        assertEquals("Album3", foundSong.getAlbum());
        assertEquals(220, foundSong.getDuration(), 0);
    }

    @Test
    public void searchByTitleTest() {
        List<Song> foundSongs = proxyServer.searchByTitle("Song2");
        assertEquals(1, foundSongs.size());
        Song song = foundSongs.get(0);
        assertEquals("Song2", song.getTitle());
        assertEquals("Artist2", song.getArtist());
        assertEquals("Album2", song.getAlbum());
        assertEquals(250, song.getDuration(), 0);
    }

    @Test
    public void searchByAlbumTest() {
        List<Song> foundSongs = proxyServer.searchByAlbum("Album5");
        assertEquals(1, foundSongs.size());
        Song song = foundSongs.get(0);
        assertEquals("Song5", song.getTitle());
        assertEquals("Artist5", song.getArtist());
        assertEquals("Album5", song.getAlbum());
        assertEquals(300, song.getDuration(), 0);
    }

    @Test
    public void searchByNonExistentIDTest() {
        assertNull(proxyServer.searchByID(10));
    }

    @Test
    public void searchByNonExistingTitleTest() {
        List<Song> foundSongs = proxyServer.searchByTitle("NonExistingTitle");
        assertEquals(0, foundSongs.size());
    }

    @Test
    public void searchByNonExistingAlbumTest() {
        List<Song> foundSongs = proxyServer.searchByAlbum("NonExistingAlbum");
        assertEquals(0, foundSongs.size());
    }
}
