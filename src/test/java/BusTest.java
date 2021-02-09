import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before() {
        bus = new Bus("Edinburgh", 5);
        person = new Person("Andrej");
    }

    @Test
    public void checkPassengerCountStartsAtZero() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());

    }

    @Test
    public void doesNotAddPassengerIfOverCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(5, bus.passengerCount());

    }

}
