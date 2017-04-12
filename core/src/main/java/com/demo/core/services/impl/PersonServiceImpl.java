package com.demo.core.services.impl;

import com.demo.core.entities.demo.DemoPerson;
import com.demo.core.services.PersonService;
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
