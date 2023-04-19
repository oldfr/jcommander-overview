package org.example;

import com.beust.jcommander.Parameter;

import java.util.List;

public class Arguments {

    @Parameter(names = "--help", help = true )
    public boolean help = false;

    @Parameter(names = "--name", required = true, description = "name of the student")
    public String name;

    @Parameter(names = "--age", required = true, description = "age of the student")
    public int age;

    @Parameter(names = "--subjects",required = true, description = "Subjects student opted for")
    public List<String> subjectList;

    @Parameter(names = "--petName", description = "pet name of the student")
    public String petName;

}
