package org.example;

public class Sum {
  static int sum(String[][] array) throws MyArraySizeException, MyArrayDataException {

    int sum = 0;

    if (4 != array.length) throw new MyArraySizeException();
    for (int i = 0; i < array.length; i++) {
      if (array[i].length != 4) throw new MyArraySizeException();
      for (int k = 0; k < array[i].length; k++) {
        try {
          sum += Integer.parseInt(array[i][k]);
        } catch (NumberFormatException e) {
          throw new MyArrayDataException(i, k);
        }
      }
    }
    return sum;
  }
}

