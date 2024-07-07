package com.vision.VibeSpace.controller;

import com.vision.VibeSpace.model.LoginRequest;
import com.vision.VibeSpace.model.UserDto;
import com.vision.VibeSpace.service.UserAuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/songs/")
@RequiredArgsConstructor
public class UserAuthController {

  private final UserAuthService userAuthService;

  @PostMapping("/signup")
  public ResponseEntity<?> registerUser(@RequestBody UserDto userDto) {
    userAuthService.registerUser(userDto);
    return ResponseEntity.ok("User registered successfully");
  }

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
    String token = userAuthService.authenticateUser(loginRequest);
    return ResponseEntity.ok(token);
  }
}
