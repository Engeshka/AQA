package org.example;

public class lesson4 {
  public static void main(String[] args) {
    employee[] employees = new employee[5];

    employees[0] = new employee("Иванов Иван", "Инженер",
      "ivivan@mail.ru", "8923123125", 30000, 51);
    employees[1] = new employee("Казанцев Сергей", "Менеджер",
      "sergo@mail.ru", "89179192345", 40000, 42);
    employees[2] = new employee("Горбатый Даниил", "Администратор",
      "danya@mail.ru", "89503498756", 25000, 30);
    employees[3] = new employee("Соколов Андрей", "Оператор",
      "sokol99@mail.ru", "89234556324", 35000, 24);
    employees[4] = new employee("Краснова Наталья", "Секретарь",
      "natashka@mail.ru", "89672333798", 38000, 47);

    for (int i = 0; i < 5; i++){
      if (employees[i].age > 40){
        System.out.println(employees[i].toString());
      }
    }
  }
}
