package com.vision.VibeSpace.model;

import lombok.Data;

@Data
public class SongDto {

  private Long id;
  private String title;
  private String artist;
  private String album;
  private String genre;
  private String s3Url;

}
