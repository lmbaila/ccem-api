package com.github.lmbaila.domain;
import java.util.UUID;
public class Team {
  private UUID id;
  private String name;
  public Team() {
  }
  public Team(UUID id, String name) {
    this.id = id;
    this.name = name;
  }
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
}
