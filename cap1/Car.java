package cap1;

public class Car {
    private final String brand;
    private final String model;

    private Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public static Car getInstance(String brand, String model) {
        // Perform validation or additional logic here if needed

        // Create and return a new Car object
        return new Car(brand, model);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

