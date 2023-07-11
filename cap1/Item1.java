package cap1;

// static factory method
public class Item1 {

    public static void main(String[] args) {
        Car car1 = Car.getInstance("Toyota", "Corolla");
        Car car2 = Car.getInstance("Honda", "Civic");

        System.out.println(car1);
        System.out.println(car2);
    }
}
