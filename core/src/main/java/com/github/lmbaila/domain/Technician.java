package com.github.lmbaila.domain;

import java.util.UUID;

public class Technician {
  private UUID id;
  private String firstname;
  private String lastname;
  private Team team;
  public Technician() {
  }
  public Technician(UUID id, String firstname, String lastname, Team team) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.team = team;
  }
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  public Team getTeam() {
    return team;
  }
  public void setTeam(Team team) {
    this.team = team;
  }

}
