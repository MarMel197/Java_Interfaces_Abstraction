package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating, double price) {
        super(name, rating, price);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 15){
            return false;
        }
        return true;
    }

}
