package com.joker.observerpattern.steptwo;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
  private String name;
  private String tips;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTips() {
    return tips;
  }

  public void setTips(String tips) {
    this.tips = tips;
  }

  public ConcreteObserver(String name, String tips) {
    super();
    this.name = name;
    this.tips = tips;
  }

  @Override
  public void update(Observable o, Object arg) {
    if (null != arg) {
      System.out.println(arg.toString() + "::" + name);
    } else {
      System.out.println(tips);
    }
  }
}
