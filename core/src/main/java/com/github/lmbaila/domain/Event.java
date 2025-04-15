package com.github.lmbaila.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import com.github.lmbaila.domain.enums.StatusEventEnum;

public class Event {
  private UUID id;
  private String summary;
  private String description;
  private String ticket;
  private Dashboard dashboard;
  private StatusEventEnum status;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private Technician technician;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Event() {}


  public Event(UUID id, String summary, String description, String ticket, Dashboard dashboard,
      StatusEventEnum status, LocalDateTime startAt, LocalDateTime endAt, Technician technician,
      LocalDateTime createdAt, LocalDateTime updatedAt) {
    this.id = id;
    this.summary = summary;
    this.description = description;
    this.ticket = ticket;
    this.dashboard = dashboard;
    this.status = status;
    this.startAt = startAt;
    this.endAt = endAt;
    this.technician = technician;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }


  public Event(UUID id, String summary, String description, String ticket, Dashboard dashboard,
      StatusEventEnum status, LocalDateTime startAt, LocalDateTime endAt, Technician technician) {
    this.id = id;
    this.summary = summary;
    this.description = description;
    this.dashboard = dashboard;
    this.ticket = ticket;
    this.status = status;
    this.startAt = startAt;
    this.endAt = endAt;
    this.technician = technician;
    this.createdAt = LocalDateTime.now();
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTicket() {
    return ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  public StatusEventEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEventEnum status) {
    this.status = status;
  }

  public LocalDateTime getStartAt() {
    return startAt;
  }

  public void setStartAt(LocalDateTime startAt) {
    this.startAt = startAt;
  }

  public LocalDateTime getEndAt() {
    return endAt;
  }

  public void setEndAt(LocalDateTime endAt) {
    compareDateEvent(getStartAt(), endAt);
    closeEvent();
    this.endAt = endAt;
  }

  public Technician getTechnician() {
    return technician;
  }

  public void setTechnician(Technician technician) {
    this.technician = technician;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  public void setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
  }

  private void closeEvent(){
    if(getStatus() != StatusEventEnum.CLOSED){
      throw 
    }
  }

  private void compareDateEvent(LocalDateTime startAt, LocalDateTime endAt){
    if(endAt.isBefore(startAt)){
      throw 
    }
  }

}
