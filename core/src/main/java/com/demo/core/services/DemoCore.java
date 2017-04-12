package com.demo.core.services;


import com.demo.core.services.impl.HelloServiceImpl;
import com.demo.core.services.impl.PersonServiceImpl;
import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.services.LibraryMapping;
public class DemoCore {

    public static void bind(ServiceBinder binder) {
        binder.bind(HelloService.class, HelloServiceImpl.class);
        binder.bind(PersonService.class, PersonServiceImpl.class);
    }

    public static void contributeComponentClassResolver(Configuration<LibraryMapping> configuration) {
        configuration.add(new LibraryMapping("democore", "com.demo.core"));
    }
//    public static void contributeHibernateEntityPackageManager(Configuration<String> configuration) {
//        configuration.add("com.demo.core.entities.demo");
//    }
}
