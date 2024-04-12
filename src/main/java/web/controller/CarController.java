package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

import static web.model.Car.cars;

@Controller
public class CarController {
    CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count == 0 || count >= 5) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", carService.carsReturn(count));
        }
        return "cars";
    }
}
