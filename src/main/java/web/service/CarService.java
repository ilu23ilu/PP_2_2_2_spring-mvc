package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> returnCountCarsFromList(List<Car> cars, int count);
    List<Car> getCarList();
}
