package com.example.SpringBootCaching.mybeans;

import org.springframework.stereotype.Component;

@Component
public class BookPricing {
    public void getSamplePrice(){
        System.out.println("$12.95");;
    }
}
