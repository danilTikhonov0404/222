package dao;

import model.Car;

import java.util.List;
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(List<Car> cars, Integer count) {
        if (count == null) {
            return cars;
        }
        return cars.stream().filter(car -> car.getId() <= count).toList();
    }
}
