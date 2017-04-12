package com.demo.commonlib.services.impl;

import com.demo.commonlib.entities.demo.DemoPerson;
import com.demo.commonlib.services.PersonService;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    @Inject
    Session session;

    @Override
    public List<DemoPerson> findPersons() {
        //noinspection unchecked
        return session.createQuery("from DemoPerson").list();

    }
}
