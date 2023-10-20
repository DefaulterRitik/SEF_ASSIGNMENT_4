import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Sample artist data
        String artistID = "569MMMRR_%";
        String artistName = "John Doe";
        String artistAddress = "Melbourne|Victoria|Australia";
        String artistBirthdate = "05-11-1980";
        String artistBio = "This is a sample bio for John Doe. It contains more than 10 words.";
        ArrayList<String> artistOccupations = new ArrayList<>();
        artistOccupations.add("Singer");
        artistOccupations.add("Songwriter");
        ArrayList<String> artistGenres = new ArrayList<>();
        artistGenres.add("Rock");
        artistGenres.add("Jazz");
        ArrayList<String> artistAwards = new ArrayList<>();
        artistAwards.add("2022, Best Song Written For Visual Media");

        // Create an Artist object
        Artist artist = new Artist(artistID, artistName, artistAddress, artistBirthdate, artistBio,
                artistOccupations, artistGenres, artistAwards);

        // Test the addArtist function
        boolean added = artist.addArtist();
        if (added) {
            System.out.println("Artist added successfully.");
        } else {
            System.out.println("Failed to add artist.");
        }

        // Test the updateArtist function
        // You need to modify artist data for testing updateArtist
        // For example, change the artist's name, occupation, or birthdate
        // Then call artist.updateArtist()

        // Example for testing update:
        artist.setName("Updated John Doe");
        artistOccupations.clear();
        artistOccupations.add("Updated Singer");
        artistOccupations.add("Updated Songwriter");

        // Update the artist object
        artist.setOccupations(artistOccupations);

        boolean updated = artist.updateArtist();
        if (updated) {
            System.out.println("Artist updated successfully.");
        } else {
            System.out.println("Failed to update artist.");
        }
    }
}
