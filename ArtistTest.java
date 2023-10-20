import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays; // Import Arrays class

public class ArtistTest1 {

    @Test
    public void testAddArtistValidID() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidID() {
        Artist artist = new Artist("23RSIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertFalse(artist.addArtist());
    }

    @Test
    public void testAddArtistValidBirthdate() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidBirthdate() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-1980-11", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertFalse(artist.addArtist());
    }

    @Test
    public void testAddArtistValidAddress() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidAddress() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Victoria|Melbourne|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertFalse(artist.addArtist());
    }

    @Test
    public void testAddArtistValidOccupations() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter", "Lyricist", "Composer")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidOccupations() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter", "Lyricist", "Composer", "Music editor", "Artistic director")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertFalse(artist.addArtist());
    }

    @Test
    public void testAddArtistValidAwards() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidAwards() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("Best Song Written For Visual Media, 2022")));

        assertFalse(artist.addArtist());
    }

    @Test
    public void testAddArtistValidGenres() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertTrue(artist.addArtist());
    }

    @Test
    public void testAddArtistInvalidGenres() {
        Artist artist = new Artist("238SIASN_$", "John Doe", "Melbourne|Victoria|Australia", "05-11-1980", "This is a valid bio.", 
                                   new ArrayList<>(Arrays.asList("Singer", "Songwriter")),
                                   new ArrayList<>(Arrays.asList("pop", "classical", "Jazz", "Hip hop", "Rock", "Folk", "Disco")),
                                   new ArrayList<>(Arrays.asList("2022, Best Song Written For Visual Media")));

        assertFalse(artist.addArtist());
    }
}
