package web.model;

import java.util.Arrays;
import java.util.List;

public class Car {

    String model;
    String color;
    int price;

    public static List<Car> cars = Arrays.asList(new Car("BMW", "red", 1000),
            new Car("Mercedes", "black", 2000), new Car("Nisan", "green", 3000),
            new Car("Lada", "white", 4000), new Car("Mazda", "blue", 5000));

    public Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
