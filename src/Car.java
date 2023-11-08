import java.awt.*;

public abstract class Car implements Movable {
    private final int nrDoors; // Number of doors on the car
    private final double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    public String modelName; // The car model name
    private double xCord;
    private double yCord;
    private direction currentDir = direction.N;

    public Car(int nrDoors, double enginePower, Color color, String modelName,
               double xCoordinate, double yCoordinate) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.xCord = xCoordinate;
        this.yCord = yCoordinate;
    }

    public enum direction {
        N, E, S, W
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
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

    public direction getCurrentDir() {
        return currentDir;
    }

    public void setColor(Color Clr) {
        color = Clr;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    public void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }


    protected abstract double speedFactor();

    // TODO fix this method according to lab pm
    public void gas(double amount) {
        if (amount <= 1 & amount >= 0)
            incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount) {
        if (amount <= 1 & amount >= 0)
            decrementSpeed(amount);
    }

    @Override
    public void move() {
        switch (currentDir) {
            case N -> yCord += currentSpeed;
            case S -> yCord -= currentSpeed;
            case E -> xCord += currentSpeed;
            case W -> xCord -= currentSpeed;
        }
    }

    @Override
    public void turnLeft() {
        switch (currentDir) {
            case N:
                currentDir = direction.W;
                break;
            case S:
                currentDir = direction.E;
                break;
            case E:
                currentDir = direction.N;
                break;
            case W:
                currentDir = direction.S;
                break;
        }
    }
    @Override
    public void turnRight() {
        switch (currentDir) {
            case N:
                currentDir = direction.E;
                break;
            case S:
                currentDir = direction.W;
                break;
            case E:
                currentDir = direction.S;
                break;
            case W:
                currentDir = direction.N;
                break;
        }
    }
}