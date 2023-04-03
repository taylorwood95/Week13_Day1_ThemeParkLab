package attractions;

import behaviours.ISecurity;
import people.Visitor;



public class Playground extends Attraction implements ISecurity {

    Visitor visitor;

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() > 15){
            return true;
        }
        return false;
    }
}
