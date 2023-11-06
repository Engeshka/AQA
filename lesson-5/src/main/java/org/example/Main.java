package org.example;

import org.example.figure.Figure;

public class Main {
  public static void main(String[] args) {
    Animal dog = new Dog("Шарик");
    dog.swim(5);
    Cat[] cats = new Cat[3];
    cats[0] = new Cat("Мурка", false, 10);
    cats[1] = new Cat("Ласка", false, 100);
    cats[2] = new Cat("Джем", false, 20);
    Plate plate = new Plate(50);
    plate.info();
    for (int i = 0; i < cats.length; i++) {
      if (cats[i].satiety == false && cats[i].desireFood < plate.food) {
        cats[i].eat(plate);
        cats[i].satiety = true;
        System.out.println("Котик " + cats[i].name + " сытый");
      } else {
        System.out.println("Котик " + cats[i].name + " не сытый");
      }
    }
    plate.info();

    //task 2
    Figure a = new Figure("Red" , "Blue", 4 , 5);
    a.perimeter(4,5);
    a.area(4,5);
    Figure b = new Figure("Yellow" , "Red", 2);
    b.perimeter(2);
    b.area(2);
    Figure c = new Figure("Black" , "White", 4, 5, 2);
    c.perimeter(4,5,2);
    c.area(4,5,2);
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());

  }
}
