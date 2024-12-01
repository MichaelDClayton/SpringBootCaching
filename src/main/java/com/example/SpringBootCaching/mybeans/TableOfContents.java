package com.example.SpringBootCaching.mybeans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TableOfContents {
    private static final Logger logger = LoggerFactory.getLogger(TableOfContents.class);


    public TableOfContents() {
    }

    public void printInfo(){
        logger.info("Testing beans from tableOfContents...");
    }
}
