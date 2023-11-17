package org.example;

public class MyArraySizeException extends Exception {
  MyArraySizeException() {
    super("Размер массива должна быть [4 x 4]");
  }
}
