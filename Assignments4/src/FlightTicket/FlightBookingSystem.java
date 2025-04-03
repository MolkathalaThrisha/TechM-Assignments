package FlightTicket;
import java.util.PriorityQueue;
import java.util.Queue;

public class FlightBookingSystem {
    private Queue<Passenger> bookingQueue;

    public FlightBookingSystem() {
        bookingQueue = new PriorityQueue<>(new PassengerPriorityComparator());
    }

    public void addBooking(Passenger passenger) {
        bookingQueue.offer(passenger);
        System.out.println("Booking added: " + passenger);
    }
    public void processBookings() {
        while (!bookingQueue.isEmpty()) {
            Passenger passenger = bookingQueue.poll();
            System.out.println("Processing booking: " + passenger);
        }
    }

    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();

     
        system.addBooking(new Passenger("Alice", 65));
        system.addBooking(new Passenger("Bob", 30));
        system.addBooking(new Passenger("Charlie", 70));
        system.addBooking(new Passenger("Diana", 30));

        
        System.out.println("\nProcessing all bookings:");
        system.processBookings();
    }
}
