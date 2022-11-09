package com.vincenteSongr.songr.repositories;

import com.vincenteSongr.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    public Album findByTitle(String title);
    public Album findByArtist(String artist);
    public Album findBySongCount(int songCount);
    public Album findByLength(int length);
    public Album findByImageURL(String imageUrl);


}
