package com.vision.VibeSpace.repository.jpa;

import com.vision.VibeSpace.entity.jpa.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Song, Integer> {

}
