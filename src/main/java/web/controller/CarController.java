package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String returnCountCarsFromList(@RequestParam(value = "count", required = false, defaultValue = "5") @PathVariable int count, Model model) {
        List<Car> carList = carService.returnCountCarsFromList(carService.getCarList(), count);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
