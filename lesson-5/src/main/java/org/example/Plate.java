package org.example;

public class Plate {
  public int food;
  public Plate(int food) {
    this.food = food;
  }
  public void deleteFood(int n) {
    food -= n;
  }
  public void addFood(int x) {
    food += x;
  }
  public void info() {
    System.out.println("Всего еды: " + food);
  }
}
