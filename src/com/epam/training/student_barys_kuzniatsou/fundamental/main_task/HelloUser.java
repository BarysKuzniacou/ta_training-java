package com.epam.training.student_barys_kuzniatsou.fundamental.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        User user = new User();
        user.setName();
        user.sayHello();
    }
}

class User {
    private String name;

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the user name: ");
        this.name = scanner.nextLine();
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
