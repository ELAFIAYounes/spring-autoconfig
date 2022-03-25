package com.example.Main;

import com.example.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Console implements CommandLineRunner {

    private final LogService logService;

    @Autowired
    public Console(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void run(String... args) throws Exception {
        logService.tracer("Bonjour ");
    }
}
