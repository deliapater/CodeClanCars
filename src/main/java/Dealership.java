import vehicle.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership {
    private ArrayList<Car> cars;
    private String name;


    public Dealership(String name) {
        this.cars = new ArrayList<Car>();
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public String getName() {
        return name;
    }

    public void addCars(Car car){
        this.cars.add(car);
    }

    public int numberOfCards(){
        return this.cars.size();
    }
}
