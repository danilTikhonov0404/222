package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {
    public CarService serviceImpl = new CarServiceImpl();
    @GetMapping("/cars")
    public String wod(@RequestParam(value = "count", required = false,defaultValue = "5") Integer count, ModelMap model){
        model.addAttribute("cars",serviceImpl.getCars(count));
        return "cars";
    }

}
