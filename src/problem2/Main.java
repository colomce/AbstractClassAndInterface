package problem2;

import problem2.models.Rideable;
import problem2.models.Bus;
import problem2.models.Car;
import problem2.models.Person;
import problem2.models.Plane;
import problem2.models.Train;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(500f, "Xiaoming");
        List<Rideable> rideableList = new ArrayList<>();
        rideableList.add(new Car());
        rideableList.add(new Train());
        rideableList.add(new Bus());
        rideableList.add(new Plane());

        for (Rideable rideable : rideableList) {
            rideable.ride(person);
        }

        /*
            Xiaoming can ride a Car
            Xiaoming can ride a Train
            Xiaoming can ride a Bus
            Xiaoming can't ride a Plane
         */
    }
}
