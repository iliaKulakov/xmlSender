package com.example.xmljmsSender;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class GreetingController {

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String,Object> model) {
////        model.put("name", name);
//        return "greeting";
//    }

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @RequestMapping(value="/greeting", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);

        Greeting greeting1 = new Greeting();
        greeting1.getListContent().add(greeting.getContent());

        for(String lines: greeting1.getListContent()){
            System.out.println("My messages in list: " + lines);
        }

        return AppConfig"result";
    }

}