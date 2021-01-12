package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating, double price) {
        super(name, rating, price);
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() >= 12) {
            return defaultPrice();
        }
        if (visitor.getAge() < 11) {
            return defaultPrice() / 2;
        }
        return 0;
    }
}
