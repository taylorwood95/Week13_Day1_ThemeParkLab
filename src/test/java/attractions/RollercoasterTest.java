package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Visitor visitor;

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 10);
        visitor = new Visitor(25, 1.60, 30);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isAllowedToRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }


    @Test
    public void canGetPriceFor(){
        assertEquals(10, rollerCoaster.priceFor(visitor), 0.0);
    }


}
