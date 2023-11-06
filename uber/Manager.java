package uber;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Taxi> list=new ArrayList<>();
    public double distance(Taxi t,Passenger p){
        return Math.sqrt((t.x - p.x)*(t.x - p.x)+(t.y - p.y)*(t.y - p.y));

    }
    public Taxi nearestTaxi(Passenger p) {
        double nearestValue = 100;
        Taxi nearestTaxi=new Taxi();
        for (Taxi t : list) {
            double value = distance(t, p);
            if (value < nearestValue) {
                nearestValue = value;
                nearestTaxi = t;
            }
        }
        fare(nearestValue);
        return nearestTaxi ;
    }

    public void fare(double value){
        double fare = (value/10)*1000;
        System.out.printf("fare will be %.1f\n",fare);
    }

    public List<Taxi> list(){
        

    }


}
