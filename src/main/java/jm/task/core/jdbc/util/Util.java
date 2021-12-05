package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/sergeytdb";
    private static String userName = "root";
    private static String password = "Z,elepyfnml;fded41";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
        // реализуйте настройку соеденения с БД
    }
}
