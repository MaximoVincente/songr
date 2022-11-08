package com.vincenteSongr.songr.controllers;

import com.vincenteSongr.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("/album")
    public String addAlbum(Model a){

        ArrayList<Album> albumArrayList = new ArrayList<>();

        Album marcAnthony = new Album("3.0", "Marc Anthony", 10, 2508, "/imgURL");
        Album motleyCrue = new Album("Dr. Feelgood", "Motley Crue", 16, 4027, "/imgURL2");
        Album zBB = new Album("The Foundation", "Zac Brown Band", 12, 2559, "/imgURL3");

        albumArrayList.add(marcAnthony);
        albumArrayList.add(motleyCrue);
        albumArrayList.add(zBB);

        a.addAttribute("marcAnthony", marcAnthony);
        a.addAttribute("motleyCrue", motleyCrue);
        a.addAttribute("zBB", zBB);

        return "album.html";
    }
}
