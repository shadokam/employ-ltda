package employltda.web.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import employltda.domain.Booking;


/**
 * Controller for view and managing Log Level at runtime.
 */
@RestController
@RequestMapping(value="/bookings")
public class BookingResource {

    @RequestMapping(method=RequestMethod.GET)
    public List<Booking> list() {
        Booking book1 = new Booking(1, "28", "10", "Igor", "note", true, 44, 587);
        Booking book2 = new Booking(2, "15", "20", "Igor", "note", false, 55, 114);

        List<Booking> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);

        return list;
    }
    
}
