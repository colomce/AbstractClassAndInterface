package problem2.models;

public class Bus extends Transportation implements Rideable {

    private static final float DRIVING_COST = 300f;

    @Override
    public void ride(Person person) {
        // add other implementation here specific to Bus.
        String msg = canRide(person, DRIVING_COST) ? " can ride a Bus" : " can't ride a Bus";
        System.out.println(person.getName() + msg);
    }
}
