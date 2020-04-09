package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService  {
    List<Car> cars = new ArrayList<>();

    public List<Car> addCar(Car car) {
        cars.add(car);
        return cars;
    }

    public List<Car> listCars() {
        return cars;
    }

    public void clearCars() {
        cars.clear();
    }

}
