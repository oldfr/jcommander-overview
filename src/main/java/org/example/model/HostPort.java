package org.example.model;

public class HostPort {

    final String host;
    final Integer port;

    public HostPort(String host, Integer port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public String toString() {
        return "HostPort{" +
                "host='" + host + '\'' +
                ", port=" + port +
                '}';
    }
}
