package com.nice.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author ningh
 */
@Component
public class DataBaseProperties implements Serializable {

    @Value("database.driverName")
    private String driverName;

    @Value("database.url")
    private String url;

    private String username;

    private String password;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    @Value("database.username")
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Value("database.password")
    public void setPassword(String password) {
        this.password = password;
    }
}
