package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarsDao carsDao;

    @Autowired
    public CarServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }
    @Override
    public List<Car> returnCountCarsFromList(List<Car> cars, int count) {
        return carsDao.returnCountCarsFromList(cars, count);
    }
    @Override
    public List<Car> getCarList() {
        return carsDao.getCarList();
    }
}
