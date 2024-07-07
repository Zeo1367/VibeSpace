package com.vision.VibeSpace.model;

import java.util.Set;
import lombok.Data;

@Data
public class UserDto {

  private Long id;
  private String username;
  private String password;
  private String email;
  private Set<String> roles;

}

