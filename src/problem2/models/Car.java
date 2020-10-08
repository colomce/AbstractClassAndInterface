package problem2.models;

public class Car extends Transportation implements Rideable {

    private static final float DRIVING_COST = 500f;

    @Override
    public void ride(Person person) {
        // add other implementation here specific to Car.
        String msg = canRide(person, DRIVING_COST) ? " can ride a Car" : " can't ride a Car";
        System.out.println(person.getName() + msg);
    }
}
