package org.example;

import org.jetbrains.annotations.NotNull;

class Cat extends Animal {
  private final int maxRunDistance = 200;
  private final int maxSwimDistance = 0;

  private static int count;
  public boolean satiety;
  public int desireFood;

  public Cat(String name, boolean satiety, int desireFood) {
    super(name);
    this.satiety = satiety;
    this.desireFood = desireFood;
    count++;
  }

  @Override
  void run(int length) {
    if ((length >= 0) && (length <= maxRunDistance)) {
      System.out.println("Кошка по кличке " + name + " пробежала " + length + " м." );
    } else {
      System.out.println("Кошка по кличке " + name + " не может пробежать такую дистанцию");
    }
  }

  @Override
  void swim(int length) {
    System.out.println("Кошки не умеют плавать!");
  }

  public int getCount() {
    return count;
  }

  public void eat(@NotNull Plate p) {
    p.deleteFood(desireFood);
  }
}
