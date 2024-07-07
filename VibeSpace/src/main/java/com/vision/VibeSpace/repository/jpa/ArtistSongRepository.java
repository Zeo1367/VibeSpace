package com.vision.VibeSpace.repository.jpa;

import com.vision.VibeSpace.entity.jpa.ArtistSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistSongRepository extends JpaRepository<ArtistSong, Integer> {

}
