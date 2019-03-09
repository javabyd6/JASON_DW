package com.sda.savejason;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sda.jason.Adress;
import com.sda.jason.Person;
import com.sda.jason.Student;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person czlowiek1 = new Person ("Darek", "Witkowski", 30);
        Person czlowiek2 = new Person ("Heniu", "Kowalski", 45);
        Person czlowiek3 = new Person ("Stefan", "Stefanowicz", 32);
        Person czlowiek4 = new Person ("Monika", "Lewandowska", 36);

        List<Person> listPerson = new LinkedList<> ();
        listPerson.add (czlowiek1);
        listPerson.add (czlowiek2);
        listPerson.add (czlowiek3);
        listPerson.add (czlowiek4);

        Student student1= new Student ("Geniu","Kowalski",new Adress ("Bydgoszcz", "Długa"));
        Student student2 = new Student ("Marek","Marecki",new Adress ("Torun","Marii Konopnickiej"));
        Student student3=new Student ("Karol","Karolewicz",new Adress ("Poznań","Bydgoska"));

        List<Student> studentList=new ArrayList<> ();
        studentList.add (student1);
        studentList.add (student2);
        studentList.add (student3);
        ObjectMapper mapper = new ObjectMapper ();
        try {
            String personStr = mapper.writeValueAsString (listPerson);

            Files.write (Paths.get ("person.json"), personStr.getBytes ());

        } catch (IOException e) {
            e.printStackTrace ();
        }
        ObjectMapper mapper1 = new ObjectMapper ();
        try{
            String studentStr = mapper1.writeValueAsString (studentList);
            Files.write (Paths.get ("student.json"),studentStr.getBytes ());


        } catch (IOException e) {
            e.printStackTrace ();
        }

    }
}
