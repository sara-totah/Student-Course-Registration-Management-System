/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentenrollmentmanager;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author saratotah
 */
public class ReadPropertiesFile {
   
    private static String url;
    private static String username;
    private static String password;
    
    public static void Read() throws Exception {
        FileInputStream config = new FileInputStream("/Users/saratotah/NetBeansProjects/StudentEnrollmentManager/src/main/java/resourses/config.properties");

        Properties prop = new Properties();

        prop.load(config);

        url = prop.getProperty("database.url");
        username = prop.getProperty("database.username");
        password = prop.getProperty("database.password");

    }
    
    public static String getUrl() {
        return url;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}
