package com.demo.commonlib.services;


import com.demo.commonlib.services.impl.HelloServiceImpl;
import com.demo.commonlib.services.impl.PersonServiceImpl;
import org.apache.tapestry5.ioc.Configuration;
import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.services.LibraryMapping;
public class CommonModule {

    public static void bind(ServiceBinder binder) {
        binder.bind(HelloService.class, HelloServiceImpl.class);
        binder.bind(PersonService.class, PersonServiceImpl.class);
    }

    public static void contributeComponentClassResolver(Configuration<LibraryMapping> configuration) {
        configuration.add(new LibraryMapping("commonmodule", "com.demo.commonlib"));
    }
    public static void contributeHibernateEntityPackageManager(Configuration<String> configuration) {
        configuration.add("com.demo.commonlib.entities.demo");
    }
}
