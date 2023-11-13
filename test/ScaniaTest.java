import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ScaniaTest {
    @Test
    public void ColorScania(){
        Scania scania = new Scania();
        assertEquals(Color.gray, scania.getColor());
    }
    @Test
    public void gas(){
        Scania scania = new Scania();
        scania.gas(1);
        assertEquals(1, scania.getCurrentSpeed());
    }
    @Test
    public void lowerPlatform(){
        Scania scania = new Scania();
        scania.lowerPlatform(-2);
        assertEquals(2, scania.getCurrentAngle());
    }
    @Test
    public void raisePlatform(){
        Scania scania = new Scania();
        scania.raisePlatform(3);
        assertEquals(3, scania.getCurrentAngle());
    }
}