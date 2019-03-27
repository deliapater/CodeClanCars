import org.junit.Test;
import vehicle.Engine;
import vehicle.Hybrid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HybridTest {
    Hybrid hybrid;


    @Test
    public void hasModel(){
        Engine engine = new Engine("petrol", "V8");
        Hybrid hybrid = new Hybrid("Prius", "Toyota", 3000, "black", engine);
        assertEquals("Prius", hybrid.getModel());
    }

    @Test
    public void canAddComponent(){
        Engine engine = new Engine("petrol", "V8");
        Hybrid hybrid = new Hybrid("Prius", "Toyota", 3000, "black", engine);
        assertEquals("An engine has been added", hybrid.addComponent("An engine"));
    }
}
