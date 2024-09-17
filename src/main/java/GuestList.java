import java.util.ArrayList;
import java.util.List;

public class GuestList {

    private List<Guest> guestList = new ArrayList();

    public void setGuests(List<Guest> guests) {
        guestList = new ArrayList<>(guests);
    }

    public List<Guest> getGuests() {
        return guestList;
    }
}
