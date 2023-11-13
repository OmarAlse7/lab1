import java.awt.*;
import java.security.InvalidParameterException;

public class Scania extends Car{

    public Scania(){
        super(2, 100, Color.gray, "Scania");
        currentAngle = 0;
        stopEngine();
    }
    private int currentAngle;
    public int getCurrentAngle(){
        return currentAngle;
    }
        @Override
        public void gas(double amount) {
            if (amount <= 1 & amount >= 0)
                incrementSpeed(amount);
        }

        @Override
        public double speedFactor() {
            return getEnginePower() * 0.01;
        }


    public void raisePlatform (int amount){
        if (getCurrentSpeed() != 0) {
            throw new InvalidParameterException("Lastbilen måste stå still");
        }
        else if (getCurrentAngle() + amount >= 70) {
            throw new InvalidParameterException("Vinkeln är för hög");
        }
        else {
            currentAngle = getCurrentAngle() + amount;
        }
    }

    public void lowerPlatform (int amount) {
        if (getCurrentSpeed() != 0) {
            throw new InvalidParameterException("Lastbilen måste stå still");
        }
        else if (getCurrentAngle() - amount <= 0) {
            throw new InvalidParameterException("Vinkeln är för låg");
        }
        else {
            currentAngle = getCurrentAngle() - amount; }
    }
}
