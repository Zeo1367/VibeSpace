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

@Table(schema = "song_file_mapping")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class SongFile {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private String id;

}
