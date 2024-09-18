package com.example.ip.ip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ip")
public class IpController {

    @GetMapping
    public List<Ip> getIp() {
        String ipAddress = "Unknown";

        try {
            RestTemplate restTemplate = new RestTemplate();
            ipAddress = restTemplate.getForObject("https://api.ipify.org?format=json", IpResponse.class).getIp();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.singletonList(new Ip(ipAddress));
    }

    private static class IpResponse {
        private String ip;

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }
}
