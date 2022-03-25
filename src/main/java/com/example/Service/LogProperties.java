package com.example.Service;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Date;

@ConfigurationProperties("log")
public class LogProperties {

    private Date prefix;
    private String suffix;

    public Date getPrefix() {
        return prefix;
    }

    public void setPrefix(Date prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
