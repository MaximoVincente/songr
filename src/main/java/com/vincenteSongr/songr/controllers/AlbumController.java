package com.vincenteSongr.songr.controllers;

import com.vincenteSongr.songr.model.Album;
import com.vincenteSongr.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;


import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")
    public String getAlbum(Model m){
        List<Album> album = albumRepository.findAll();
        m.addAttribute("album", album);
        return "album.html";
    }

    @PostMapping("/album")
    public RedirectView createAlbum(String title, String artist, int songCount, int length, String imageURL) {
        Album newAlbum = new Album(title, artist, songCount, length, imageURL);
        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }
}
