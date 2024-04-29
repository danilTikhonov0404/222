package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import servis.CarServisiml;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    public CarServisiml servisiml =new CarServisiml();
    @GetMapping("/cars")
    public String wod(@RequestParam(value = "count", required = false,defaultValue = "5") Integer count, ModelMap model){
        model.addAttribute("cars",servisiml.print(count));
        return "cars";
    }

}
