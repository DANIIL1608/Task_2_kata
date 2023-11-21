package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Арсений", "Петрушков", (byte) 40);
        userDao.saveUser("Афанасий", "Петров", (byte) 45);
        userDao.saveUser("Гарельт", "из Ривии", (byte) 120);
        userDao.saveUser("Эмгыр", "вар Эмрейс", (byte) 29);

        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers().toString());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
