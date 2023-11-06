package org.example;

abstract class Animal {
  protected String name;
  protected int maxRunDistance;
  protected int maxSwimDistance;
  private static int count;

  public Animal(String name) {
    this.name = name;
    count++;
  }

  abstract void run(int length);

  abstract void swim(int length);
  public Animal(String name, int maxRunDistance, int maxSwimDistance) {
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;
    count++;
  }
  public int getCount() {
    return count;
  }

}
