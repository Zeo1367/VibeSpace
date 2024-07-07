package com.vision.VibeSpace.controller;

import com.vision.VibeSpace.service.SongInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/songs/")
@RequiredArgsConstructor
public class SongInventoryController {

  private final SongInventoryService songInventoryService;

  @PostMapping("/upload")
  public ResponseEntity<?> uploadSong(@RequestParam("file") MultipartFile file,
      @RequestParam("metadata") String metadata) {
    songInventoryService.uploadSong(file, metadata);
    return ResponseEntity.ok("Song uploaded successfully");
  }
}
