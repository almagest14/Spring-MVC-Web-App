package no.rodob.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringAppController {

    @RequestMapping
    public String home() {
        System.out.print("this is home!");
        return "/WEB-INF/jsp/home.jsp";
    }
}
