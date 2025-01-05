package com.project.easyschool.service;

import com.project.easyschool.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

//    @Autowired
//    private PersonRepository personRepository;
//
//    @Autowired
//    private RolesRepository rolesRepository;
//
//    public boolean createNewPerson(Person person){
//        boolean isSaved = false;
//        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
//        person.setRoles(role);
//        person = personRepository.save(person);
//        if (null != person && person.getPersonId() > 0)
//        {
//            isSaved = true;
//        }
//        return isSaved;
//    }
}
