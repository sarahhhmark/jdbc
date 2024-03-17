package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Johan", "Liebert", (byte) 20);
        userService.saveUser("Levi", "Ackerman", (byte) 33);
        userService.saveUser("Kakashi", "Hatake", (byte) 37);
        userService.saveUser("Itachi", "Uchiha", (byte) 19);
        List<User> res = userService.getAllUsers();
        for (User user : res) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
