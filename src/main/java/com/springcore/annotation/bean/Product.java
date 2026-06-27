package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component("product")
public class Product {

    public Product() {
        log.info("Product bean is created.");
    }

    public void getProductDetails() {
        log.info("Product details are being fetched.");
    }
}
