package com.vincenteSongr.songr.controllers;

import com.vincenteSongr.songr.album.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Locale;


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

    @GetMapping("/album")
    public String addAlbum(Model a){

        ArrayList<Album> albumArrayList = new ArrayList<>();

        Album marcAnthony = new Album("3.0", "Marc Anthony", 10, 2508, "/imgURL");
        Album motleyCrue = new Album("Dr. Feelgood", "Motley Crue", 16, 4027, "/imgURL2");
        Album zBB = new Album("The Foundation", "Zac Brown Band", 12, 2559, "/imgURL3");
        albumArrayList.add(marcAnthony);
        albumArrayList.add(motleyCrue);
        albumArrayList.add(zBB);

        a.addAttribute("album", albumArrayList);

        return "album.html";

    }

}
