package com.joker.singleton.hungry;

/**
 * 单例模式-饿汉
 */
public class Singleton {
  private static Singleton singleton;

  private Singleton() {}

  static {
    singleton = new Singleton();
  }

  public Singleton getInstance() {
    return singleton;
  }
}
