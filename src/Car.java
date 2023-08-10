public class Car {
    String name;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", s=" + s +
                ", capacity=" + capacity +
                '}';
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

}
