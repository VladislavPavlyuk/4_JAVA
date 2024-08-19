package Classes;/*Задание 1
Реализуйте класс «Человек».
Необходимо хранить полях класса:
- ФИО,
- дату рождения,
- контактный телефон,
- город,
- страну,
- домашний адрес.
Реализуйте методы класса для
- ввода данных,
- вывода данных.

К уже реализованному классу «Человек» добавьте
необходимые конструкторы, а также необходимые пере-
груженные методы.*/

import java.time.LocalDate;

import java.util.Scanner;

import java.util.Scanner;

public class Human {
    private String fullName; //ФИО
    private String birthDate; //дату рождения
    private String phoneNumber; //контактный телефон
    private String city; //город
    private String country; //страну
    private String homeAddress; //домашний адрес

    // Конструктор по умолчанию
    public Human() {
        this.fullName = "";
        this.birthDate = "";
        this.phoneNumber = "";
        this.city = "";
        this.country = "";
        this.homeAddress = "";
    }

    // Конструктор с параметрами
    public Human(String fullName, String birthDate, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Конструктор копирования
    public Human(Human other) {
        this.fullName = other.fullName;
        this.birthDate = other.birthDate;
        this.phoneNumber = other.phoneNumber;
        this.city = other.city;
        this.country = other.country;
        this.homeAddress = other.homeAddress;
    }

    // Методы для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        this.fullName = scanner.nextLine();

        System.out.print("Введите дату рождения: ");
        this.birthDate = scanner.nextLine();

        System.out.print("Введите контактный телефон: ");
        this.phoneNumber = scanner.nextLine();

        System.out.print("Введите город: ");
        this.city = scanner.nextLine();

        System.out.print("Введите страну: ");
        this.country = scanner.nextLine();

        System.out.print("Введите домашний адрес: ");
        this.homeAddress = scanner.nextLine();
    }

    // Методы для вывода данных
    public void displayData() {
        System.out.println("ФИО: " + this.fullName);
        System.out.println("Дата рождения: " + this.birthDate);
        System.out.println("Контактный телефон: " + this.phoneNumber);
        System.out.println("Город: " + this.city);
        System.out.println("Страна: " + this.country);
        System.out.println("Домашний адрес: " + this.homeAddress);
    }

    // Методы доступа к отдельным полям
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    // Перегруженные методы
    public void displayData(String prefix) {
        System.out.println(prefix + " ФИО: " + this.fullName);
        System.out.println(prefix + " Дата рождения: " + this.birthDate);
        System.out.println(prefix + " Контактный телефон: " + this.phoneNumber);
        System.out.println(prefix + " Город: " + this.city);
        System.out.println(prefix + " Страна: " + this.country);
        System.out.println(prefix + " Домашний адрес: " + this.homeAddress);
    }
}
