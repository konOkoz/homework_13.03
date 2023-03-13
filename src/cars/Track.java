package cars;

import cars.Car;

public class Track extends Car {
    int loadCapacity;
    public Track(String model, String colour, int procutionDate, int loadCapacity){
        super(model, colour, procutionDate);
        this.loadCapacity=loadCapacity;
    }
    public int getLoadCapacity(){
        return loadCapacity;
    }
}
