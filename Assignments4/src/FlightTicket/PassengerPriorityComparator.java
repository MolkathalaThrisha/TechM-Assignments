package FlightTicket;
import java.util.Comparator;

public class PassengerPriorityComparator implements Comparator<Passenger> {
    @Override
    public int compare(Passenger p1, Passenger p2) {
        if (p1.getAge() != p2.getAge()) {
            return Integer.compare(p2.getAge(), p1.getAge());
        }

        return p1.getBookingTime().compareTo(p2.getBookingTime());
    }
}
