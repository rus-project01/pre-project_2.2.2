package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarService();

    @GetMapping("/cars")
    public String printCars(@RequestParam("locale") String name, ModelMap model) {
        if(name.equals("en")) {
            model.addAttribute("messages", carService.listCars()).addAttribute("names", "CARS");
        } else if (name.equals("ru")) {
            model.addAttribute("messages", carService.listCars()).addAttribute("names", "МАШИНЫ");
        }
        return "cars";
    }
}
