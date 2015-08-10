package com.demo.module1.pages;

import com.demo.commonlib.entities.demo.DemoPerson;
import com.demo.commonlib.services.PersonService;
import org.apache.tapestry5.ioc.annotations.Inject;

import java.util.List;

public class PersonGrid {
    @Inject
    PersonService personService;

    public List<DemoPerson> getPersons() {
        return personService.findPersons();
    }


}