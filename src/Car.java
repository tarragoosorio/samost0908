import java.util.Objects;

public class Car {
    String name;

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", s=" + s +  ", capacity=" + capacity + '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public int getS() {
        return s;
    }

    int s;
    int capacity;
    public Car(String name, int s, int capacity) {
        this.name = name;
        this.s = s;
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return s == car.s && capacity == car.capacity && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, s, capacity);
    }
}
