package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating, price);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() < 146) {
            return false;
        }
        if (visitor.getAge() < 13) {
            return false;
        }
        return true;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() <= 200) {
            return defaultPrice();
        }
        if (visitor.getHeight() > 200) {
            return defaultPrice() * 2;
        }
        return 0;
    }
}