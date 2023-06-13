package com.gt;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    static final Logger logger = LogManager.getLogger(App.class.getName());
    public static void main(String[] args) {
        logger.error("Error!");
    }
}
