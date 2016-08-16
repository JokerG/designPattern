package com.joker.observerpattern.stepone;

public class ConcreteSubject extends Subject {

  private String day;

  @Override
  public void Notify() {
    for (int i = 0; i < this.observerList.size(); i++) {
      this.observerList.get(i).update(day);
    }
  }

  /**
   * @return the status
   */
  public String getDay() {
    return day;
  }

  /**
   * @param status the status to set
   */
  public void setDay(String day) {
    this.day = day;
    this.Notify();
  }
}
