import cars.PassengerCar;
import cars.Track;

public class Main {
    public static void main(String[] args) {

        /*
Создать класс cars.Car, содержащий поля
model
colour
productionDate
а также конструктор и методы drive и stop.
Создать дочерние классы cars.PassengerCar и cars.Track. Класс cars.PassengerCar должен также содержать поле numberOfSeats(количество мест)
а Класс cars.Track поле loadCapacity (грузоподьемность).
В методе main класса Main создать несколько обьектов этих классов и вывести в консоль их характеристики и результат работы методов
         */
      cars.PassengerCar car1 = new PassengerCar("Hyundai","Black",2018,5);
      cars.Track track1 = new Track("Mercedes","Silver",2010,2000);
      System.out.println(car1.getColour());
      System.out.println(car1.getNumberOfSeats());
      System.out.println(track1.getProductionDate());
      System.out.println(track1.getLoadCapacity());
      car1.drive();
      car1.stop();
      track1.drive();
      track1.stop();
    }
}