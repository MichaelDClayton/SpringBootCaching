package com.example.SpringBootCaching.mybeans;

import com.example.SpringBootCaching.AppRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TableOfContents {
    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);


    public TableOfContents() {
    }

    public void printInfo(){
        logger.info("Testing beans from tableOfContents...");
    }
}
