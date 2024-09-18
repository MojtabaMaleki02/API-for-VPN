package com.example.ip.ip;

public class Ip {
    private String ipAddress;

    public Ip(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Ip{" +
                "ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
