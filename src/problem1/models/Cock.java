package problem1.models;

public class Cock implements Purchasable {
    @Override
    public int buy(int amount) {
        return 4 * amount;
    }
}
