package problem1.models;

public class Chicken implements Purchasable {
    @Override
    public int buy(int amount) {
        return 75 + (3 * amount);
    }
}
