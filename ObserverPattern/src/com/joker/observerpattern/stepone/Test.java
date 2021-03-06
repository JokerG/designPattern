package com.joker.observerpattern.stepone;

import com.joker.observerpattern.base.Enums;

public class Test {

  public static void main(String[] args) {
    ConcreteObserver observer1 = new ConcreteObserver("小花", "jiehun");
    ConcreteObserver observer2 = new ConcreteObserver("老马", "相亲");
    ConcreteSubject subject = new ConcreteSubject();
    subject.attach(observer1);
    subject.attach(observer2);
    subject.setDay(Enums.WeekDay.ONE.getDay());
  }

}
