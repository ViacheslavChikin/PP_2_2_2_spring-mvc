package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

import static web.model.Car.cars;

public class CarServiceImp implements CarService {

        public  List<Car> carsReturn(int x) {
            return cars.stream().limit(x).collect(Collectors.toList()); }
}
