package org.example.figure;

public class Figure implements Area{
  public String fill;
  public String boarder;
  public String name;
  public double pl;
  public int per;

  public Figure(String fill, String boarder, int a, int b, int c){
    this.fill = fill;
    this.boarder = boarder;
    this.name = "Треугольник";
  }
  public Figure(String fill, String boarder, int a){
    this.fill = fill;
    this.boarder = boarder;
    this.name = "Квадрат";
  }
  public Figure(String fill, String boarder, int a, int b){
    this.fill = fill;
    this.boarder = boarder;
    this.name = "Прямоугольник";
  }


  @Override
  public double area(int a, int b) {
    this.pl = a * b;
    return pl;
  }
  @Override
  public double area(int a, int b, int c) {
    this.pl = Math.sqrt(per * (per - a) * (per - b) * (per - c));
    return pl;
  }
  @Override
  public double area(int a) {
    this.pl = a * a;
    return pl;
  }

  @Override
  public int perimeter(int a, int b) {
    this.per = Area.super.perimeter(a,b);
    return per;
  }
  @Override
  public int perimeter(int a) {
    this.per = a * 4;
    return per;
  }
  @Override
  public int perimeter(int a, int b, int c) {
    this.per = a + b + c;
    return per;
  }
  @Override
  public String toString() {
    return name + "[Заливка: " + fill + ", Граница: " + boarder + ", Периметр: " + per + ",Площадь: " + pl;
  }
}


