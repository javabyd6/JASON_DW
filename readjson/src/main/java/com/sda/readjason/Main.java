package com.sda.readjason;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.jason.Person;
import com.sda.jason.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper ();
        try {

            Person[] personRead = mapper.readValue (new File ("person.json"), Person[].class);
            List<Person> personList = Arrays.asList (personRead);
            System.out.println (personList.toString ());

        } catch (IOException e) {
            e.printStackTrace ();
        }


        ObjectMapper mapper1 = new ObjectMapper ();
        try {

            Student[] studentRead = mapper1.readValue (new File ("student.json"), Student[].class);
            List<Student> studentsList = Arrays.asList (studentRead);
            System.out.println (studentsList.toString ());

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
