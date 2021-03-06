package com.joker.observerpattern.stepone;

public class ConcreteObserver implements Observer {
  private String name;
  private String tips;

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }



  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }



  /**
   * @return the tips
   */
  public String getTips() {
    return tips;
  }



  /**
   * @param tips the tips to set
   */
  public void setTips(String tips) {
    this.tips = tips;
  }



  /** Creates a new instance of ConcreteObserver. */
  public ConcreteObserver(String name, String tips) {
    super();
    this.name = name;
    this.tips = tips;
  }



  @Override
  public void update(String day) {
    System.out.println(day + ":::" + name + ":::" + tips);
  }

}
