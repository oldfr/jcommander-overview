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
        String studentPassword = arguments.studentPassword;
        Boolean studentIsSpeciallyAbled = arguments.isSpeciallyAbled;
        System.out.println("Student Name: "+studentName);
        System.out.println("Student age: "+studentAge);
        System.out.println("Student opted for subjects: "+String.join(", ",subjectsOpted));
        System.out.println("Student password: "+studentPassword);
        System.out.println("Student is specially abled:"+studentIsSpeciallyAbled);
        if(Objects.nonNull(studentPetName))
            System.out.println("Student pet name: "+studentPetName);
    }
}
