package edu.dlipinsky.Homework3;

/**
 * Created by Денис on 21.10.2015.
 */
public class Employee {

    public byte age;
    public String name;
    public String lastName;

    public Employee(byte age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }
    // Employee (конструктор) заменяет сеттеры, это единственный случай, когда имя переменной пишется с большой буквы


    public Employee () {

    }

}
