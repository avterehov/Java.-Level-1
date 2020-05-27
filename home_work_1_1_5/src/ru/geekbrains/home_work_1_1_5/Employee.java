package ru.geekbrains.home_work_1_1_5;

public class Employee {

    String name;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

   void printData(){
        System.out.println("Name:" + name);
        System.out.println("Position: "+ position);
        System.out.println("E-mail: " + email + "\t\tPhone number:" + phoneNumber);
        System.out.println("Salary: " + salary + " RUR" + "\t\t\t Age: " + age);
    }

    }




