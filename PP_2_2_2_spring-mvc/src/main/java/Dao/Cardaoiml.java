package Dao;

import model.Car;

import java.util.List;

public class Cardaoiml implements Cardao {
    @Override
    public List<Car> print(List<Car> cars, Integer count) {
        if (count==null){
            return cars;
        }
        return cars.stream().filter(car -> car.getId()<=count).toList();
    }
}
