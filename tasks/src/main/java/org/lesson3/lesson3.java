package org.lesson3;

public class lesson3 {
  public static boolean task1(int a, int b){
    int sum = a + b;
    return (sum >= 10 && sum <= 20);
  }
  public static void task2(int a){
    if (a >= 0){
      System.out.println("Число положительное");
    }else{
      System.out.println("Число отрицательное");
    }
  }
  public static boolean task3(int a){
    if (a > 0){
      return false;
    }else{
      return true;
    }
  }
  public static void task4(String s, int a){
    for (int i = 0; i < a; i++){
      System.out.println(s);
    }
  }
  public static boolean task5(int a){
    if ((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))){
      return true;
    }else{
      return false;
    }
  }
  public static int[] task10(int len, int initalValue) { // task 10
    int[] array = new int[len];   //массив с заданной длинной, всем элементам присваивается initalValue
    for (int i = 0; i < len; i++) {
      array[i] = initalValue;
    }
    return array;
  }




  public static void main(String[] args) {
    System.out.println(task1(5,16)); // сумма в диапазоне 10 и 20 включительно границы
    task2(-2); // отрицательное или положительное
    System.out.println(task3(19)); // положительное - false, отрицательное - true
    task4("z", 5); // строка передается указанное кол-во раз
    System.out.println(task5(2000));// високосный год

    int[] a = {1, 0, 1, 0, 1};   // task 6 меняем элементы массива: 0 на 1, 1 на 0
    for (int i = 0; i < 5; i++){    // меняем элементы массива: 0 на 1, 1 на 0
      if (a[i] == 0){
        a[i] = 1;
      }else{
        a[i] = 0;
      }
      System.out.println("a[" + i + "] = " + a[i]);
    }

    int[] b = new int[100]; // task 7
    for (int i = 0; i < 100; i++){ // массив заполнить значениями от 1 до 100
      b[i] = i + 1;
    }

    int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // task 8
    for (int i = 0; i < c.length; i++){  // удвоить значения, меньшие 6
      if (c[i] < 6){
        c[i] *= 2;
      }
      System.out.println("c[" + i + "] = " + c[i]);
    }
    int [][] d = new int [4][4]; // task 9
    for (int i = 0; i < 4; i++){ //заполнить диагонали двумерного массива единицами
      for(int j = 0; j < 4; j++){
        if(( i == j) || ((i + j) == 3)) {
          d[i][j] = 1;
        }
      }
    }
  }
}
