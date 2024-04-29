import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.Song; 

public class SongTest {
    private Song song; 

    @Before
    public void setUp() {
        song = new Song(1, "Title", "Artist", "Album", 100); 
    }

    @Test
    public void gettersTest() {
        assertEquals(Integer.valueOf(1), song.getSongID());
        assertEquals("Title", song.getTitle());
        assertEquals("Artist", song.getArtist());
        assertEquals("Album", song.getAlbum());
        assertEquals(100, song.getDuration(), 0);
    }

    @Test
    public void settersTest() {
        song.setSongID(2);
        song.setTitle("SongTitle");
        song.setArtist("SongArtist");
        song.setAlbum("SongAlbum");
        song.setDuration(200);

        assertEquals(Integer.valueOf(2), song.getSongID());
        assertEquals("SongTitle", song.getTitle());
        assertEquals("SongArtist", song.getArtist());
        assertEquals("SongAlbum", song.getAlbum());
        assertEquals(200, song.getDuration(), 0);
    }
}
