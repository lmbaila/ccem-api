package com.github.lmbaila.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateEvent {
  private UUID id;
  private String description;
  private Event event;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public UpdateEvent() {}

  public UpdateEvent(UUID id, String description, Event event, LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    this.id = id;
    this.description = description;
    this.event = event;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public UpdateEvent(UUID id, String description, Event event) {
    this.id = id;
    this.description = description;
    this.createdAt = LocalDateTime.now();
    this.event = event;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



}
