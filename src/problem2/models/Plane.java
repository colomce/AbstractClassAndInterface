package problem2.models;

public class Plane extends Transportation implements Rideable {

    private static final float DRIVING_COST = 1000f;

    @Override
    public void ride(Person person) {
        // add other implementation here specific to Plane.
        String msg = canRide(person, DRIVING_COST) ? " can ride a Plane" : " can't ride a Plane";
        System.out.println(person.getName() + msg);
    }
}
