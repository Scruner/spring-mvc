package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getListCars(@RequestParam(value = "locale") String locale, ModelMap modelCar) throws UnsupportedEncodingException {
        ResourceBundle bundle = ResourceBundle.getBundle("messages");
        String value = new String(bundle.getString(locale).getBytes("ISO-8859-1"), "UTF-8");

        modelCar.addAttribute("carList", carService.getListCars());
        modelCar.addAttribute("locale", value);

        return "cars";
    }
}
