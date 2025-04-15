package com.github.lmbaila.domain;

public class Report {
  private Long id;
  private Integer eventDuraction;
  private Event event;
  public Report() {
  }
  public Report(Long id, Integer eventDuraction, Event event) {
    this.id = id;
    this.eventDuraction = eventDuraction;
    this.event = event;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Integer getEventDuraction() {
    return eventDuraction;
  }
  public void setEventDuraction(Integer eventDuraction) {
    this.eventDuraction = eventDuraction;
  }
  public Event getEvent() {
    return event;
  }
  public void setEvent(Event event) {
    this.event = event;
  }

}
