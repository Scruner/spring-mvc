package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceIml implements CarService {

    public List<Car> getListCars() {

        Car car1 = new Car(1L, "Toyota", 111);
        Car car2 = new Car(2L, "Man", 222);
        Car car3 = new Car(3L, "BMW", 333);

        List<Car> carList = new ArrayList<>();

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        return carList;
    }
}
