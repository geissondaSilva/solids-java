package open_closed.vehicles;

public class Car implements Vehicle {
    @Override
    public String getSpecie() {
        return "car";
    }

    @Override
    public Integer getAxes() {
        return 2;
    }
}
