package org.example;

import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    String[] headers = {"Value1", "Value2", "Value3", "Value4"};
    int[][] data = {{10, 20, 30, 40}, {13, 22, 35, 44}};
    AppData d = new AppData();
    d.setHeader(headers);
    d.setData(data);
    FileOutputStream outt = new FileOutputStream("values.csv");
    PrintWriter out = new PrintWriter(outt);
    for (int i = 0; i < d.getHeader().length - 1; i++) {
      out.print(d.getHeader()[i] + ";");
    }
    out.print(d.getHeader()[d.getHeader().length - 1]);
    out.println();
    for (int i = 0; i < d.getData().length; i++) {
      for (int j = 0; j < d.getData()[0].length; j++) {
        if (j == d.getData()[0].length - 1) {
          out.print(d.getData()[i][d.getData()[0].length - 1]);
          out.println();
        } else {
          out.print(d.getData()[i][j] + ";");
        }
      }
    }
    out.close();
    System.out.println("Данные записаны в файл!");
    BufferedReader fp = new BufferedReader(new FileReader("values.csv"));
    String[] hdr = fp.readLine().split(";");
    for (String h : hdr){
      System.out.print(h + ";");
    }
    System.out.println();
    String[] row1 = fp.readLine().split(";");
    for (String a : row1){
      System.out.print(a + ";");
    }
    System.out.println();
    String[] row2 = fp.readLine().split(";");
    for (String b : row2){
      System.out.print(b + ";");
    }

    fp.close();
  }
}
