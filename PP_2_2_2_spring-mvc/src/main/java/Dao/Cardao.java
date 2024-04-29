package Dao;

import model.Car;

import java.util.List;

public interface Cardao {
    List<Car> print(List<Car> cars, Integer count);
}
