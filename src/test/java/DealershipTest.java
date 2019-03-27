import org.junit.Before;
import org.junit.Test;
import vehicle.Car;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;

    @Before
    public void setUp() {
        dealership = new Dealership("CodeClan");
        dealership.addCars(car);
        dealership.addCars(car);

    }

    @Test
    public void hasCars(){
        assertEquals(2, dealership.numberOfCards() );
    }
}
