package com.project.easyschool.service;

import com.project.easyschool.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private static Logger log = LoggerFactory.getLogger(ContactService.class);


    public boolean saveContact(Contact contact) {
        // TODO: Implement this method with persistence logic
        log.info(contact.toString());
        return true;
}


}
