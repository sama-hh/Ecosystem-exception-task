import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {
    @Test
    void shouldBeEmptyInitially() {
        //Given
        GuestList guestList = new GuestList();
        //When
        guestList.setGuests(List.of());
        //Then
        List<String> result = guestList.getGuests();
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        //Given
        GuestList guestList = new GuestList();
        //When
        guestList.setGuests(List.of("Karl", "Ute"));
        //Then
        List<String> result = guestList.getGuests();
        assertEquals(List.of("Karl", "Ute"), result);
    }

    @Test
    void shouldWriteToFileSystem() throws IOException {
        //Given
        GuestList guestList = new GuestList();
        //WHEN
        guestList.setGuests(List.of("Theodor", "Anette"));
        Path path = Path.of("guests.txt");
        guestList.writeFile(path);
        //THEN
        assertTrue(Files.exists(path));
        List<String> result = Files.readAllLines(path);
    }

    @Test
    void shouldReadFromFileSystem() throws IOException {
        //GIVEN
        Path path = Path.of("guests.txt");
        Files.write(path, List.of("Stephan", "Max"));
        GuestList guestList = new GuestList();
        guestList.readFile(path);
        //WHEN
        List<String> result = guestList.getGuests();
        //THEN
        assertEquals(List.of("Stephan", "Max"), result);
    }

    @Test
    void exceptionOccursWhenReadingNonExistingFile() {
        Path path = Path.of("noFile.txt");
        GuestList guestList = new GuestList();
        assertThrows(IOException.class, () -> guestList.readFile(path));
    }

    @Test
    void addGuestToFileAddAdditionalLine() throws IOException {
        Path path = Path.of("guests.txt");
        GuestList guestList = new GuestList();
        //WHEN
        guestList.addGuest("John");
        //THEN
        assertTrue(Files.readAllLines(path).contains("John"));
    }

}