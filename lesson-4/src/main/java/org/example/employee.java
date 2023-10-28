package org.example;

public class employee {
  String name;
  String position;
  String email;
  String telephone;
  int salary;
  int age;

  public employee(String name, String position, String email, String telephone, int salary, int age ){
    this.name = name;
    this.position = position;
    this.email = email;
    this.telephone = telephone;
    this.salary = salary;
    this.age = age;
  }
  @Override
  public String toString(){
    return "Сотрудник [Имя=" + name + ", Должность=" + position +
      ", Телефон=" + telephone + ", Зарплата=" + salary + ", Возраст=" + age + "]";
  }
}
