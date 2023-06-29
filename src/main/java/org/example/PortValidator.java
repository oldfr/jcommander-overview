package org.example;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class PortValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        try{
            Integer.parseInt(value.split(":")[1]);
        }
        catch (NumberFormatException ex) {
            throw new ParameterException("Parameter "+name+" should be integer");
        }
    }
}
