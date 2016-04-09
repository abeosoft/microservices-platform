package com.abeosoft.services.platform;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigurationTestClientApplication {

    @Value("${configuration.projectName}")
    private String projectName;

    @Value("${mysql.jdbc.host}")
    private String host;

    @Value("${mysql.jdbc.port}")
    private int port;

    @Value("${mysql.jdbc.database}")
    private String database;

    @Value("${mysql.jdbc.username}")
    private String username;

    @Value("${mysql.jdbc.password}")
    private String password;

    public String getProjectName() {
	return projectName;
    }

    public void setProjectName(String projectName) {
	this.projectName = projectName;
    }

    public String getHost() {
	return host;
    }

    public void setHost(String host) {
	this.host = host;
    }

    public int getPort() {
	return port;
    }

    public void setPort(int port) {
	this.port = port;
    }

    public String getDatabase() {
	return database;
    }

    public void setDatabase(String database) {
	this.database = database;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public static void main(String[] args) {
	SpringApplication.run(ConfigurationTestClientApplication.class, args);
    }

    @RequestMapping("/project")
    public String project() {
	return this.projectName;
    }

    @RequestMapping("/host")
    public String host() {
	return this.host;
    }

    @Autowired
    void setEnvironment(Environment e) {
	System.out.println(e.getProperty("configuration.projectName"));
    }
}

class ConnectionConfig {

    @Value("${configuration.projectName}")
    private String projectName;

    @Value("${mysql.jdbc.host}")
    private String host;

    @Value("${mysql.jdbc.port}")
    private int port;

    @Value("${mysql.jdbc.database}")
    private String database;

    @Value("${mysql.jdbc.username}")
    private String username;

    @Value("${mysql.jdbc.password}")
    private String password;

    public String getProjectName() {
	return projectName;
    }

    public void setProjectName(String projectName) {
	this.projectName = projectName;
    }

    public String getHost() {
	return host;
    }

    public void setHost(String host) {
	this.host = host;
    }

    public int getPort() {
	return port;
    }

    public void setPort(int port) {
	this.port = port;
    }

    public String getDatabase() {
	return database;
    }

    public void setDatabase(String database) {
	this.database = database;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}