import org.junit.Test;
import vehicle.Engine;
import vehicle.Petrol;

import static org.junit.Assert.assertEquals;

public class PetrolTest {
    Petrol petrol;

    @Test
    public void canAddComponent() {
        Engine engine = new Engine("petrol", "V8");
        Petrol petrol = new Petrol("Astra", "Vauxhall", 5000, "black", engine);
        assertEquals("An engine has been added", petrol.addComponent("An engine"));
    }
}
