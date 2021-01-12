package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;
    Visitor visitor2;


    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7, 0);
        visitor = new Visitor(16, 160.0, 100.0);
        visitor2 = new Visitor(10, 100.0, 10.0);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isNotAllowedTo(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedTo(){
        assertEquals(true, playground.isAllowedTo(visitor2));
    }
}
