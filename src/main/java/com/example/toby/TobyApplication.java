package com.example.toby;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TobyApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        SpringApplication.run(TobyApplication.class, args);

        UserDao dao = new UserDao();
        User user = new User();
        user.setId("aaa");
        user.setName("test1");
        user.setPassword("1111");

        dao.add(user);
        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + " 조회 성공");
    }

}
