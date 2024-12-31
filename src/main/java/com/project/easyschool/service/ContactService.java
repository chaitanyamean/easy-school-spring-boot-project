package com.project.easyschool.service;

import com.project.easyschool.constants.EazySchoolContants;
import com.project.easyschool.model.Contact;
import com.project.easyschool.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContactService {


    @Autowired
    private ContactRepository contactRepository;

    private static Logger log = LoggerFactory.getLogger(ContactService.class);


    public boolean saveContact(Contact contact) {
        // TODO: Implement this method with persistence logic
        boolean isSaved = false;
        contact.setStatus(EazySchoolContants.OPEN);
        contact.setCreatedBy(EazySchoolContants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if (result > 0) {
            isSaved = true;
        }
        return isSaved;

    }

    public List<Contact> findMsgsWithOpenStatus(){
        List<Contact> contactMsgs = contactRepository.findMsgsWithStatus(EazySchoolContants.OPEN);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy){
        boolean isUpdated = false;
        int result = contactRepository.updateMsgStatus(contactId,EazySchoolContants.CLOSE, updatedBy);
        if(result>0) {
            isUpdated = true;
        }
        return isUpdated;
    }

}
