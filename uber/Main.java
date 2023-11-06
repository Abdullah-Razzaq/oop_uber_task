package uber;

public class Main {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.list.add(new Taxi(1,10,4.5,"yes"));
        manager.list.add(new Taxi(2,20,40,"yes"));
        Passenger passenger= new Passenger(3.5,5.5);
        System.out.println(manager.nearestTaxi(passenger));

    }
}
