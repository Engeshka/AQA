package org.example.figure;

public interface Area {

  public double area(int a, int b);

  double area(int a, int b, int c);

  public double area(int a);


  public default int perimeter(int a, int b) {
    return (a + a + b + b);
  };

  int perimeter(int a);

  int perimeter(int a, int b, int c);
}
