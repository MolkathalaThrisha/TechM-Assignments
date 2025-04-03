package FlightTicket;
import java.time.LocalDateTime;

public class Passenger {
    private String name;
    private int age;
    private LocalDateTime bookingTime;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.bookingTime = LocalDateTime.now();
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public LocalDateTime getBookingTime() { return bookingTime; }

    @Override
    public String toString() {
        return "Passenger{name='" + name + "', age=" + age + ", bookingTime=" + bookingTime + '}';
    }
}
