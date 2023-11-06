package org.example;

class Dog extends Animal {
  private final int maxRunDistance = 500;
  private final int maxSwimDistance = 10;

  private static int count;
  public Dog(String name) {
    super(name);
    count++;
  }

  @Override
  void run(int length) {
    if ((length >= 0) && (length <= maxRunDistance)) {
      System.out.println("Собака по кличке " + name + " пробежала " + length + " м." );
    } else {
      System.out.println("Собака по кличке " + name + " не может пробежать такую дистанцию");
    }
  }

  @Override
  void swim(int length) {
    if ((length >= 0) && (length <= maxSwimDistance)) {
      System.out.println("Собака по кличке " + name + " проплыла " + length + " м." );
    } else {
      System.out.println("Собака по кличке " + name + " не может проплыть такую дистанцию!");
    }
  }
  public int getCount() {
    return count;
  }

}
