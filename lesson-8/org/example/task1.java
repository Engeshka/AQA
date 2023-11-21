package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task1 {
  public static void printUniqueAndDuplicates(String[] a) {
    Set<String> unique = new HashSet<String>();
    for (String i : a) {
      unique.add(i);
    }
    System.out.println("Количество элементов в массиве: " + a.length + ", уникальных элементов: " + unique.size());
    System.out.println("Уникальные элементы: " + unique);
    Map<String, Integer> elementCount = new HashMap<String, Integer>();
    for (String x : a) {
      if (!elementCount.containsKey(x)){
        elementCount.put(x, 1);
      }
      else {
        elementCount.put(x, elementCount.get(x) + 1);
      }

    }
    System.out.println("Элемент = количество повторений в массиве: \n" + elementCount);

  }
}
