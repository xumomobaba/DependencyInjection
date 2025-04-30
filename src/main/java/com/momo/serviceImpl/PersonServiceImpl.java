package com.momo.serviceImpl;

import com.momo.dao.PersonDao;
import com.momo.service.PersonService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource(name="personDao")
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    @Override
    public void add() {
        System.out.println("Service层的add()方法执行了");
        personDao.add();
    }
}
