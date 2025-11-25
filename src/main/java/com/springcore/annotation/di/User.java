package com.springcore.annotation.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * @Autowired
 * Match ByType - Based on type of bean it will inject the dependency
 * Match ByQualifier - Based on name of bean it will inject the dependency
 * Mach ByName - Based on variable name it will inject the dependency
 *
 * @Inject
 * It is part of Java standard (JSR-330)
 * It works same as @Autowired but does not have 'required' attribute
 * Match by Type
 * Match by Qualifier
 * Match by Name
 *
 * @Resource
 * It is part of Java standard (JSR-250)
 * It works based on name of the bean
 * Match by Name
 * Match by Type
 * Match by Qualifier
 */
@Component
public class User {

    @Inject
    private Vehicle honda;

    /*
    public User(Vehicle honda) {
        this.honda = honda;
    }
*/
/*    @Autowired
    public void setHonda(Vehicle honda) {
        this.honda = honda;
    }*/

    public void driveVehicle() {
        honda.drive();
    }
}
