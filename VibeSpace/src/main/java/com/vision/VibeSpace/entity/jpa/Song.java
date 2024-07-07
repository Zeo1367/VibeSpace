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

@Table(schema = "song")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String metadata;
  private String title;
  private String artist;
  private String album;
  private String genre;
  private String s3Url;

}
