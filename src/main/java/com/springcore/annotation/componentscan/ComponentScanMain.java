package com.springcore.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComponentScanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(RestaurantConfig.class);

        log.info("Getting beans from the context...");

        Restaurant restaurant = context.getBean(Restaurant.class);
        Menu menu = context.getBean(Menu.class);

        restaurant.greet();
        menu.displayMenu();

        context.close();
    }
}
