package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(15, 1.95, 25.00);
        dodgems = new Dodgems("Bumper Cars", 10 , 10.4);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

//    @Test
//    public void hasPriceForKid(){
//        assertEquals(10.0, dodgems.priceFor(visitor), 0.0);
//    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(10.4, dodgems.defaultPrice(), 0.0);
    }






}
