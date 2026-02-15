package com.myapps;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Model model) throws Exception{
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostAddress();
    }
}
