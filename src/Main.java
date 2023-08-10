import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars= new ArrayList<>();
        cars.add(new Car("Камаз", 60, 5000));
        cars.add(new Car("Ламборгини", 200, 1000));
        cars.add(new Car("Хаммер", 120, 2000));
        cars.add(new Car("ЗиЛ", 88, 3000));
        System.out.println(cars);
        cars.sort((o1, o2) -> (int) o1.getS() - o2.getS());
        System.out.println(cars);
        cars.sort((o1, o2) -> o1.toString().compareTo(o2.toString()));
        System.out.println(cars);

    }
}