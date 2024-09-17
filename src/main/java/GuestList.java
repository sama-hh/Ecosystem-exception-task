import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GuestList {
    private List<String> guestList = new ArrayList();

    public void setGuests(List<String> guests) {
        guestList = new ArrayList<>(guests);
    }

    public List<String> getGuests() {
        return guestList;
    }

    public void writeFile(Path filePath) throws IOException {
        Files.write(filePath, guestList);
    }

    public void readFile(Path filePath) throws IOException {
        guestList = Files.readAllLines(filePath);
    }

    public void addGuest(String guest) throws IOException {
        guestList.add(guest);
        Path path = Path.of("guests.txt" );
        Files.write(path, guestList);
    }
}
