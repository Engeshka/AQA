package org.example;

import java.util.*;
import static org.example.task1.printUniqueAndDuplicates;

public class Main {
  public static void main(String[] args) {
    String[] words = {"tom", "jerry", "steve", "josh", "kate", "jammy", "ron",
      "harry", "tom", "kate", "jerry", "tom", "harry"};
    printUniqueAndDuplicates(words); // метод реализован в классе task1


    Phonebook phonebook = new Phonebook();

    phonebook.add("89178974655", "Nabiullina");
    phonebook.add("89672235678", "Nabiullina");
    phonebook.add("89509456778", "Nabiullina");
    phonebook.add("89872765688", "Valeev");
    phonebook.add("89871214115", "Valeev");
    phonebook.add("89653489132", "Kostornov");

    phonebook.get("Valeev");
    phonebook.get("Ivanov");
  }
}
