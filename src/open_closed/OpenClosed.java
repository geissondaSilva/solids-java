package open_closed;

import open_closed.vehicles.Car;
import open_closed.vehicles.Truck;
import open_closed.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * This principle suggests that software entities
 * must be open to extension, but closed for modification
 */
public class OpenClosed {

    /**
     * This example of the use this principle in interface Vehicle
     * The specific class that implementation the interface and create methods
     * In class the method getSpecie and getAxes can have more implementations
     * without modifying the interface and the other classes that implement it
     */
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Truck(2));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.print());
        }
    }
}
