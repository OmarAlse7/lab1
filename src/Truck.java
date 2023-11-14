import java.awt.*;

public class Truck extends Vehicle {
    private double angle;

    public Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);              // Call the constructor of the superclass (Vehicle) to initialize common attributes
    }
    public double getAngle(){
        return angle;
    }
    public boolean notMoving(){
        return !(getCurrentSpeed() > 0.0);
    }

    public void raisePlatform (double amount){
        if (notMoving() & amount > 0 & (angle+amount) <= 70.0){
            angle += amount;
        }
    }
    public void lowerPlatform (double amount){
        if (notMoving() & amount > 0 & (angle - amount >= 0.0)) {
            angle -= amount;
        }
    }
    @Override
    public double speedFactor() {
        return getEnginePower() * 0.01;
    }


}
