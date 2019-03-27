import org.junit.Test;
import vehicle.Electric;
import vehicle.Tyre;

import static org.junit.Assert.assertEquals;

public class ElectricTest {
    Electric electric;

    @Test
    public void canAddComponent() {
        Tyre tyre = new Tyre("A", "A");
        Electric electric = new Electric("Y", "Tesla", 30000, "white", tyre);
        assertEquals("A tyre has been added", electric.addComponent("A tyre"));
    }
}