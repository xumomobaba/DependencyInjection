package com.momo.action;

import com.momo.service.PersonService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller("personAction")
@Component
public class PersonAction {
    @Resource(name="personService")
    private PersonService personService;

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public PersonService getPersonService() {
        return personService;
    }

    public void add() {
        System.out.println("Action层的add()方法执行了。");
        personService.add();
    }
}
