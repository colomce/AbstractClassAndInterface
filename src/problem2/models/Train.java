package problem2.models;

public class Train extends Transportation implements Rideable {

    private static final float DRIVING_COST = 400f;

    @Override
    public void ride(Person person) {
        // add other implementation here specific to train.
        String msg = canRide(person, DRIVING_COST) ? " can ride a Train" : " can't ride a Train";
        System.out.println(person.getName() + msg);
    }
}
