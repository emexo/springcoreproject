package com.springcoreproject.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Product {
    private int productId;
    private String productName;

    public Product(){
        this.productId = 12;
        this.productName = "Laptop";
    }

    public void  getProductDetails(){
       log.info("productid:{} and productname:{}", productId, productName);
    }
}
