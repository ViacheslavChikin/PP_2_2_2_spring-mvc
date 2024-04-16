package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

import static web.model.Car.cars;


@Component
public class CarServiceImp implements CarService {

    public List<Car> carsReturn(int x) {
        return cars.stream().limit(x).collect(Collectors.toList());
    }
}
