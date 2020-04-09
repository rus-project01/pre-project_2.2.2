package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService  {
    List<Car> cars = new ArrayList<>();

    public List<Car> listCars() {
        cars.add(new Car("Solaris", "000", 8));
        cars.add(new Car("Kopeyka", "123", 15));
        cars.add(new Car("Lada Kalina", "666", 999999));
        return cars;
    }

}
