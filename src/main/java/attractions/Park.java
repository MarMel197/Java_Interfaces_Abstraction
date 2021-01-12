package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating, double price) {
        super(name, rating, price);
    }
}
