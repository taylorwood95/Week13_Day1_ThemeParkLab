package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    private int price;

    Visitor visitor;

    public RollerCoaster(String name, int rating, int price) {
        super(name, rating);
        this.price = price;


    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 1.45){
            return true;
        }
        return false;
    }


    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return this.price * 2;
        }
        return this.price;
    }


}
