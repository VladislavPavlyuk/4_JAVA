package Classes;

import java.util.Scanner;
/*
Задание 2
Создайте класс «Город».
Необходимо хранить в полях класса:
- название города,
- название региона,
- название страны,
- количество жителей в городе,
- почтовый индекс города,
- телефонный код города.
Реализуйте методы класса
- для ввода данных,
- вывода данных,
- реализуйте доступ к отдельным полям через методы класса.

К уже реализованному классу «Город» добавьте необ-
ходимые конструкторы, а также необходимые перегру-
женные методы.
*/
public class City {
    private String cityName; //город
    private String regionName; //регион
    private String countryName; //страна
    private int population; //количество жителей в городе
    private String postalCode; //почтовый индекс города
    private String phoneCode; //телефонный код города

    // Конструктор по умолчанию
    public City() {
        this.cityName = "";
        this.regionName = "";
        this.countryName = "";
        this.population = 0;
        this.postalCode = "";
        this.phoneCode = "";
    }

    // Конструктор с параметрами
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Конструктор копирования
    public City(City other) {
        this.cityName = other.cityName;
        this.regionName = other.regionName;
        this.countryName = other.countryName;
        this.population = other.population;
        this.postalCode = other.postalCode;
        this.phoneCode = other.phoneCode;
    }

    // Методы для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название города: ");
        this.cityName = scanner.nextLine();

        System.out.print("Введите название региона: ");
        this.regionName = scanner.nextLine();

        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();

        System.out.print("Введите количество жителей: ");
        this.population = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Введите почтовый индекс: ");
        this.postalCode = scanner.nextLine();

        System.out.print("Введите телефонный код: ");
        this.phoneCode = scanner.nextLine();
    }

    // Методы для вывода данных
    public void displayData() {
        System.out.println("Название города: " + this.cityName);
        System.out.println("Название региона: " + this.regionName);
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Почтовый индекс: " + this.postalCode);
        System.out.println("Телефонный код: " + this.phoneCode);
    }

    // Методы доступа к отдельным полям
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    // Перегруженные методы
    public void displayData(String prefix) {
        System.out.println(prefix + " Название города: " + this.cityName);
        System.out.println(prefix + " Название региона: " + this.regionName);
        System.out.println(prefix + " Название страны: " + this.countryName);
        System.out.println(prefix + " Количество жителей: " + this.population);
        System.out.println(prefix + " Почтовый индекс: " + this.postalCode);
        System.out.println(prefix + " Телефонный код: " + this.phoneCode);
    }


}
