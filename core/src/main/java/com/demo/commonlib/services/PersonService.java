package com.demo.commonlib.services;

import com.demo.commonlib.entities.demo.DemoPerson;

import java.util.List;

public interface PersonService {

    List<DemoPerson> findPersons();
}
