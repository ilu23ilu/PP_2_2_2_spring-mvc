package web.dao;

import web.models.Car;

import java.util.List;

public interface CarsDao {
    List<Car> returnCountCarsFromList(List<Car> cars, int count);
    List<Car> getCarList();
}
