package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
;import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDaoHibernateImpl userService = new UserDaoHibernateImpl();
        userService.createUsersTable();

        User user1 = new User("Sergey", "Pavlov", (byte) 33);
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.printf("User with name %s was added to the table.\n", user1.getName());
        User user2 = new User("Vladimir", "Pavlov", (byte) 13);
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.printf("User with name %s was added to the table.\n", user2.getName());
        User user3 = new User("Alexandra", "Pavlova", (byte) 32);
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.printf("User with name %s was added to the table.\n", user3.getName());
        User user4 = new User("Maria", "Pavlova", (byte) 4);
        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.printf("User with name %s was added to the table.\n", user4.getName());

        userService.removeUserById(3);

        List<User> list= userService.getAllUsers();
        System.out.println(list);

        userService.cleanUsersTable();

        userService.dropUsersTable();

        Util.getSessionFactory().close();
    }
}




