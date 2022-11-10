package com.vincenteSongr.songr.controllers;

import com.vincenteSongr.songr.model.Album;
import com.vincenteSongr.songr.model.Song;
import com.vincenteSongr.songr.repositories.AlbumRepository;
import com.vincenteSongr.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/song")
    public String getAllSongs(Model m){
        List<Song> song = songRepository.findAll();
        m.addAttribute("song", song);
        return "album";
    }

    @PostMapping("/songAdd")
    public RedirectView createNewSong(String title, int length, int trackNumber, String albumName){
        Album album = albumRepository.findByTitle(albumName);
//        Album album = albumRepository.findById(albumID);
        Song newSong = new Song(title, length, trackNumber, album);
        songRepository.save(newSong);
        return new RedirectView("/album");
    }

}
