package com.vincenteSongr.songr.controllers;

import com.vincenteSongr.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;


@Controller
public class SongrController {

    @GetMapping("/hello")
    public String getHello() {
        return "hello.html";
    }

    @GetMapping("/capitalize/{capitalizedGreeting}")
    public String capitalizedHello(@PathVariable String capitalizedGreeting, Model m) {
        String allCaps = capitalizedGreeting.toUpperCase();
        m.addAttribute("greetingCaps", allCaps);
        return "helloCapitalized.html";
    }

    @GetMapping("/")
    public String splashPage() {
        return "splash.html";
    }

}
