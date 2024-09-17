import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially(){

//        Given
        GuestList guestList = new GuestList();

//        When
        guestList.setGuests(List.of());

//        Then
        List<Guest> result = guestList.getGuests();
        assertTrue(result.isEmpty());

    }

}