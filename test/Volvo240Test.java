import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Volvo240Test {
    Volvo240 volvo = new Volvo240();
    @Test
    void volvo_should_have_four_doors() {
        assertEquals(4, volvo.getNrDoors());
    }
    @Test
    void testing_speed_factor(){
        assertEquals(1.25,volvo.speedFactor() );
    }
    @Test
    void TestConstructor(){
        Volvo240 c = new Volvo240();
        assertNotEquals(c, null);
    }
}