package com.joker.observerpattern.stepone;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题
 */
public abstract class Subject {
  protected static List<Observer> observerList;

  public void attach(Observer observer) {
    observerList.add(observer);
  }

  public void detach(Observer observer) {
    observerList.remove(observer);
  }

  static {
    observerList = new ArrayList<Observer>();
  }

  public abstract void Notify();
}
