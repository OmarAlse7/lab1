import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Saab95Test {
    @Test
    void nr_doors() {
        Saab95 saab = new Saab95();
        assertEquals(2, saab.getNrDoors());
    }

    @Test
    void turboOn() {
        Saab95 saab = new Saab95();
        Saab95.setTurboOn();
        assertEquals(1.625, saab.speedFactor());
    }
    @Test
    void SpeedFactorWithNoTurbo () {
        Saab95 saab = new Saab95();
        saab.setTurboOff();
        assertEquals(1.25, saab.speedFactor());
    }
    @Test
    void SpeedFactorWithTurbo () {
        Saab95 saab = new Saab95();
        assertEquals(1.25, saab.speedFactor());
    }
    @Test
    void TestConstructor(){
        Saab95 c = new Saab95();
        assertNotEquals(c, null);
    }
}