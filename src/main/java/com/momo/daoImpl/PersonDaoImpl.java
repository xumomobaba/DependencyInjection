package com.momo.daoImpl;

import com.momo.dao.PersonDao;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository("personDao")
@Service
public class PersonDaoImpl implements PersonDao {

    @Override
    public void add() {
        System.out.println("DAO层的add（）方法执行了");
    }
}
