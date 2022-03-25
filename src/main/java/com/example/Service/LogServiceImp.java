package com.example.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImp implements LogService {

    private static final Logger logger = LoggerFactory.getLogger(LogServiceImp.class);

    @Autowired
    private LogProperties logProperties;

    @Override
    public void tracer(String message) {
        logger.info(this.logProperties.getPrefix() +
                " Trace AFFICHÉE dans LogServiceImp : " +
                message +
                this.logProperties.getSuffix());
    }
}
