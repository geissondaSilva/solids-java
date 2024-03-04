package open_closed.vehicles;

public interface Vehicle {

    String getSpecie();

    Integer getAxes();

    default String print() {
        return String.format("The vehicle %s has %d axes", getSpecie(), getAxes());
    }
}
