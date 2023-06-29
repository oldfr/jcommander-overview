package org.example.converter;

import com.beust.jcommander.IStringConverter;
import org.example.model.HostPort;

public class HostPortConverter implements IStringConverter<HostPort> {
    @Override
    public HostPort convert(String value) {
        String[] s = value.split(":");
        return new HostPort(s[0], Integer.parseInt(s[1]));
    }
}