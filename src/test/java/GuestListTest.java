import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GuestListTest {

    @Test
    void shouldBeEmptyInitially(){
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



}