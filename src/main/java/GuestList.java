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
}
