package problem1.models;

public class Hen implements Purchasable {
    @Override
    public int buy(int amount) {
        return 25 - (7 * amount);
    }
}
