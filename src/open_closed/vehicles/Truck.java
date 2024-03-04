package open_closed.vehicles;

public class Truck implements Vehicle {

    private final Integer axes;

    public Truck(Integer axes) {
        this.axes = axes;
    }

    @Override
    public String getSpecie() {
        return "truck";
    }

    /**
     * In this implementation is implement method in the interface Vehicle and can not
     * are modify other classes
     * @return number of axe od the truck
     */
    @Override
    public Integer getAxes() {
        return axes;
    }
}
