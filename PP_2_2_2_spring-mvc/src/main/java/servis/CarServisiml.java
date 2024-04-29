package servis;

import Dao.Cardao;
import Dao.Cardaoiml;
import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServisiml implements ServisCar {
    Cardao cardao = new Cardaoiml();
    ArrayList<Car> cars = new ArrayList<>();{
        cars.add(new Car(1,"vaz",1));
        cars.add(new Car(2,"vaz",2));
        cars.add(new Car(3,"vaz",3));
        cars.add(new Car(4,"vaz",4));
        cars.add(new Car(5,"vaz",5));
    }

    @Override
    public List<Car> print(int count) {
        return cardao.print(cars, count);


    }
}
