package org.example;

public class MyArrayDataException extends Exception{
  MyArrayDataException(int row, int column) {
    super("Данные неверного формата находятся в ячейке [" + row + ", " + column + "]");
  }
}

