package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Visitor visitor;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 15){
            return true;
        }
        return false;
    }

    public int getRating(){
        return this.getRating();
    }
}

