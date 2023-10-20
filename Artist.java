import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList<String> Occupations;
    private ArrayList<String> Genres;
    private ArrayList<String> Awards;

    public Artist(String id, String name, String address, String birthdate, String bio,
                  ArrayList<String> occupations, ArrayList<String> genres, ArrayList<String> awards) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setOccupations(ArrayList<String> occupations) {
        Occupations = occupations;
    }

    public boolean addArtist() {
        if (!validateArtistInformation()) {
            return false;
        }

        // Code to add the artist information to a TXT file goes here
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("artists.txt", true))) {
            writer.write(ID + "|" + Name + "|" + Address + "|" + Birthdate + "|" + Bio + "|" +
                    String.join(",", Occupations) + "|" + String.join(",", Genres) + "|" + String.join(",", Awards));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public boolean updateArtist() {
        if (!validateArtistInformation()) {
            return false;
        }

        // Check the conditions for updating artist information and update the TXT file accordingly
        // For example, you can search for the artist by ID in the file and replace the old information

        // Code to update artist information in the TXT file goes here

        return true;
    }

    private boolean validateArtistInformation() {
        // Check all conditions for adding/updating an artist here
        // For simplicity, you can implement these checks in separate methods
        return isValidID(ID) && isValidBirthdate(Birthdate) && isValidAddress(Address) &&
                isValidBio(Bio) && isValidOccupations(Occupations) && isValidGenres(Genres) &&
                isValidAwards(Awards);
    }

    // Implement methods for checking individual conditions as per your requirements

    private boolean isValidID(String id) {
        // Implement ID validation logic here
        // Example: Check if ID meets the specified pattern
        return id.matches("[5-9]{3}[A-Z]{5}[_%]{2}");
    }

    private boolean isValidBirthdate(String birthdate) {
        // Implement birthdate validation logic here
        // Example: Check if birthdate matches the DD-MM-YYYY format
        return birthdate.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    private boolean isValidAddress(String address) {
        // Implement address validation logic here
        // Example: Check if address matches the City|State|Country format
        return address.matches("^[A-Za-z]+\\|[A-Za-z]+\\|[A-Za-z]+$");
    }

    private boolean isValidBio(String bio) {
        // Implement bio validation logic here
        // Example: Check if the bio length is between 10 and 30 words
        int wordCount = bio.split("\\s+").length;
        return wordCount >= 10 && wordCount <= 30;
    }

    private boolean isValidOccupations(ArrayList<String> occupations) {
        // Implement occupations validation logic here
        // Example: Check if the number of occupations is between 1 and 5
        return occupations.size() >= 1 && occupations.size() <= 5;
    }

    private boolean isValidGenres(ArrayList<String> genres) {
        // Implement genres validation logic here
        // Example: Check if genres don't contain both "pop" and "rock"
        return !genres.contains("pop") || !genres.contains("rock");
    }

    private boolean isValidAwards(ArrayList<String> awards) {
        // Implement awards validation logic here
        // Example: Check if each award follows the specified format
        for (String award : awards) {
            String[] parts = award.split(", ");
            if (parts.length != 2) return false;
            String year = parts[0];
            String title = parts[1];
            if (!year.matches("\\d{4}") || title.length() < 4 || title.length() > 10) return false;
        }
        return true;
    }
}
