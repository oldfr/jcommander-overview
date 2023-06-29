package org.example;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import org.example.converter.HostPortConverter;
import org.example.model.HostPort;

import java.util.List;

public class Arguments {

    @Parameter(names = "--help", help = true )
    public boolean help = false;

    @Parameter(names = {"--name", "-n"}, required = true, description = "name of the student")
    public String name;

    @Parameter(names = {"--age", "-a"}, required = true, description = "age of the student")
    public int age;

    @Parameter(names = "--subjects",required = true, description = "Subjects student opted for")
    public List<String> subjectList;

    @Parameter(names = {"-password","-p"}, description = "Connection password", password = true, required = true, echoInput = true)
    public String studentPassword;

    @Parameter(names = "--petName", description = "pet name of the student")
    public String petName;

    @Parameter(names = "--isSpeciallyAbled", description = "Flag if student is specially abled")
    public Boolean isSpeciallyAbled;

    @Parameter(names = "--hostaddr", description = "hostname and port", converter = HostPortConverter.class, validateWith = {PortValidator.class})
    public HostPort hostPort;

    @Parameter(description = "main param")
    public String mainParam;

}
