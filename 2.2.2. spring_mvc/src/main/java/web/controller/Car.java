package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Car {

    private Long id;
    private String brend;
    private int series;

    @GetMapping(value = "/cars")
    public List<String> getListCars(Model modelCar) {
        List<Car> listCars = new ArrayList<>();
        modelCar.addAllAttributes("listCars". listCars)
    }
}
