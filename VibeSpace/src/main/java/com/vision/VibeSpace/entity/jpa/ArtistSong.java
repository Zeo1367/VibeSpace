package com.vision.VibeSpace.entity.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(schema = "artist_song_mapping")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ArtistSong {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;

  private String userType;

}
