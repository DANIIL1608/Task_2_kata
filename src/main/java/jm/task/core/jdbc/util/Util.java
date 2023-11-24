package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "kharek", "kharek");
        } catch (Exception ex) {
            System.err.println("Connection failed...");
        }
        return connection;
    }
}
