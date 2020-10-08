package problem2.models;

public abstract class Transportation implements Rideable {
    public boolean canRide(Person person, float drivingCost) {
        return person.getBudget() >= drivingCost;
    }
}
