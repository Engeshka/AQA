package org.example;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
  private Map<String, String> phonebook;
  Phonebook() {
    phonebook = new HashMap<>();
  }
  public void add(String telephone, String name) {
    phonebook.put(telephone, name);
  }
  public void get(String name){
    if(phonebook.containsValue(name)) {
      for (String telephone : phonebook.keySet()){
        if (phonebook.get(telephone).equals(name)){
          System.out.println(name + ":" + telephone);
        }
      }
    }
    else System.out.println("Контакта " + name + " нет в справочнике!");
  }
}
