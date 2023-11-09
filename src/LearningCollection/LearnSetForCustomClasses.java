package com.company;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.DoubleToIntFunction;

public class LearnSetForCustomClasses {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Alok",2));
        studentSet.add(new Student("Shivam",3));
        studentSet.add(new Student("Rohit",2));
        System.out.println(studentSet);


    }
}
