package com.project.easyschool.controller;


import com.project.easyschool.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jakarta.validation.Valid;
import org.springframework.validation.Errors;

@Slf4j
@Controller
@RequestMapping("public")

public class PublicController {

    @RequestMapping(value ="/register",method = { RequestMethod.GET})
    public String displayRegisterPage(Model model) {
        model.addAttribute("person", new Person());
        return "register.html";
    }

    @RequestMapping(value ="/createUser",method = { RequestMethod.POST})
    public String createUser(@Valid @ModelAttribute("person") Person person, Errors errors) {
        if(errors.hasErrors()){
            return "register.html";
        }
//        boolean isSaved = personService.createNewPerson(person);
//        if(isSaved){
            return "redirect:/login?register=true";
//        }else {
//            return "register.html";
//        }
    }
}
