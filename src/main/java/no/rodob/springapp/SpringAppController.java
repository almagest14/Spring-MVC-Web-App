package no.rodob.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class SpringAppController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        System.out.println("this is home!");
        return "home";
    }

    @RequestMapping(value = "/give-me-a-list", method = RequestMethod.GET)
    public ModelAndView listOfStrings() {
        final List<String> items = Arrays.asList("first", "second", "third");
        return new ModelAndView("modelAndView", "items", items);
    }
}
