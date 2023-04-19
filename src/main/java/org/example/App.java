package org.example;

import com.beust.jcommander.JCommander;

import java.util.List;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Arguments arguments = new Arguments();
        JCommander jCommander = JCommander.newBuilder().addObject(arguments).build();
        jCommander.parse(args);

        if(arguments.help) {
            jCommander.usage();
            return;
        }

        String studentName = arguments.name;
        int studentAge = arguments.age;
        List<String> subjectsOpted = arguments.subjectList;
        String studentPetName = arguments.petName;
        System.out.println("Student Name: "+studentName);
        System.out.println("Student age: "+studentAge);
        System.out.println("Student opted for subjects: "+String.join(", ",subjectsOpted));
        if(Objects.nonNull(studentPetName))
            System.out.println("Student pet name: "+studentPetName);
    }
}
