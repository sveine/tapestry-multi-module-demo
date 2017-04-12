package com.demo.core.services;

import com.demo.core.entities.demo.DemoPerson;

import java.util.List;

public interface PersonService {

    List<DemoPerson> findPersons();
}
