package cars;

import cars.Car;

public class PassengerCar extends Car {
    int numberOfSeats;
    public PassengerCar(String model, String colour, int procutionDate, int numberOfSeats){
        super(model, colour, procutionDate);
        this.numberOfSeats=numberOfSeats;
    }
 public int getNumberOfSeats(){
        return numberOfSeats;
 }
}
