package web.dao;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDaoImpl implements CarsDao {
    private List<Car> carList;

    public CarsDaoImpl() {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X3", 10000));
        carList.add(new Car("AUDI", "A4", 7000));
        carList.add(new Car("Volvo", "C60", 6000));
        carList.add(new Car("LADA", "2107", 100));
        carList.add(new Car("Nissan", "Sentra", 4000));
    }
    @Override
    public List<Car> returnCountCarsFromList(List<Car> cars, int count) {
        cars = carList;
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}
