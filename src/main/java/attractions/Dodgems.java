package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public double price;

    Visitor visitor;


    public Dodgems(String name, int rating, double price ) {
        super(name, rating);
        this.price = price;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getAge() < 15.0){
            return this.price / 2;
        }
        return this.price;


    }

    public double getPrice(){
        return this.price;
    }
}



