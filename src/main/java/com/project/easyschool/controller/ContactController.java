package com.project.easyschool.controller;

import com.project.easyschool.model.Contact;
import com.project.easyschool.service.ContactService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    private static Logger log = LoggerFactory.getLogger(ContactController.class);
    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @RequestMapping("/contact")
    public String getContactPage() {
        return "contact.html";
    }

//    @RequestMapping(value="/saveMsg", method = RequestMethod.POST)
//        public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum, @RequestParam String email, @RequestParam String subject,
//                @RequestParam String message){
//            log.info("Name: " + name);
//            log.info("mobileNum: " + mobileNum);
//            log.info("email: " + email);
//            log.info("subject: " + subject);
//            log.info("message: " + message);
//
//            return new ModelAndView("redirect:/contact");
//
//    }
      @RequestMapping(value="/saveMsg", method = RequestMethod.POST)
    public ModelAndView saveMessage(Contact contact) {
           contactService.saveContact(contact);
          return new ModelAndView("redirect:/contact");
      }

}