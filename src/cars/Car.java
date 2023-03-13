package cars;

public class Car {

    String model;
    String colour;
    int productionDate;

    Car(String model, String colour, int procutionDate){
        this.model=model;
        this.colour=colour;
        this.productionDate=procutionDate;
    }

    public void drive(){
        System.out.println(model+" moving");
    }
    public void stop(){
        System.out.println(model+" stopped");
    }
    public String getModel(){
        return model;
    }
    public String getColour(){
        return colour;
    }
    public int getProductionDate(){
        return productionDate;
    }
}
