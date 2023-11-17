package org.example;

import static org.example.Sum.sum;

public class Main {
  public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
    String[][] array1 = {
      {"1", "2", "3", "4"},
      {"1", "2", "3", "4"},
      {"0", "5", "1", "2"},
      {"0", "5", "1", "2"}};
    String[][] array2 = {
      {"1", "2", "3", "4"},
      {"1", "2", "3", "4"},
      {"0", "5", "1", "2"},
      {"0", "!", "1", "2"}};
    String[][] array3 = {
      {"1", "2", "3", "4"},
      {"1", "2", "3", "4"},
      {"0", "5", "1", "2"},
      {"0"}};
    System.out.println("Сумма элементов первого массива равна " + sum(array1));
    //System.out.println(sum(array2));
    System.out.println(sum(array3));
  }
}
