import java.awt.*;

public abstract class Car implements Movable{
    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    public String modelName; // The car model name
    private double xCord;
    private double yCord;
    private int currentDir;
    private final String[] dir = {"NORTH", "EAST", "SOUTH", "WEST"};
    public Car(int nrDoors, double enginePower, Color color, String modelName,
               double xCoordinate, double yCoordinate, int direction) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.xCord = xCoordinate;
        this.yCord = yCoordinate;
        this.currentDir = direction;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public double getxCord() {
        return xCord;
    }

    public double getyCord() {
        return yCord;
    }
    public int getCurrentDir() {
        return currentDir;
    }

    public void setColor(Color Clr){
        color = Clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }


    protected abstract double speedFactor();

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if(amount <= 1 & amount >= 0)
            incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if(amount <= 1 & amount >= 0)
            decrementSpeed(amount);
    }
    @Override
    public void move(){
        switch (dir[currentDir]) {
            case "NORTH" -> yCord += currentSpeed;
            case "SOUTH" -> yCord -= currentSpeed;
            case "EAST" -> xCord += currentSpeed;
            case "WEST" -> xCord -= currentSpeed;
        }
    }
    @Override
    public void turnLeft() {
        this.currentDir--;
        this.currentDir = Math.floorMod(currentDir, 4);
        }

    @Override
    public void turnRight() {
        this.currentDir++;
        this.currentDir = Math.floorMod(currentDir, 4);
    }
}
