package Classes;
/*
Задание 3
Создайте класс «Страна».
Необходимо хранить в полях класса:
- название страны,
- название континента,
- количество жителей в стране,
- телефонный код страны,
- название столицы,
- название городов страны.
Реализуйте методы класса для ввода данных, вывода данных, реализуйте
доступ к отдельным полям через методы класса.

К уже реализованному классу «Страна» добавьте не-
обходимые конструкторы, а также необходимые перегру-
женные методы.
*/

import java.util.Scanner;

public class Country {
    private String countryName; //название страны
    private String continentName; //название континента
    private int population; //количество жителей в стране
    private String phoneCode; //телефонный код страны
    private String capitalCity; //название столицы
    private String[] cities; //название городов страны

    // Конструктор по умолчанию
    public Country() {
        this.countryName = "";
        this.continentName = "";
        this.population = 0;
        this.phoneCode = "";
        this.capitalCity = "";
        this.cities = new String[0];
    }

    // Конструктор с параметрами
    public Country(String countryName, String continentName, int population, String phoneCode, String capitalCity, String[] cities) {
        this();
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capitalCity = capitalCity;
        this.cities = cities;
    }

    // Конструктор копирования
    public Country(Country other) {
        this.countryName = other.countryName;
        this.continentName = other.continentName;
        this.population = other.population;
        this.phoneCode = other.phoneCode;
        this.capitalCity = other.capitalCity;
        this.cities = other.cities.clone();
    }

    // Методы для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название страны: ");
        this.countryName = scanner.nextLine();

        System.out.print("Введите название континента: ");
        this.continentName = scanner.nextLine();

        System.out.print("Введите количество жителей: ");
        this.population = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Введите телефонный код страны: ");
        this.phoneCode = scanner.nextLine();

        System.out.print("Введите название столицы: ");
        this.capitalCity = scanner.nextLine();

        System.out.print("Введите количество городов: ");
        int numCities = scanner.nextInt();
        scanner.nextLine(); // consume newline
        this.cities = new String[numCities];

        for (int i = 0; i < numCities; i++) {
            System.out.print("Введите название города " + (i + 1) + ": ");
            this.cities[i] = scanner.nextLine();
        }
    }

    // Методы для вывода данных
    public void displayData() {
        System.out.println("Название страны: " + this.countryName);
        System.out.println("Название континента: " + this.continentName);
        System.out.println("Количество жителей: " + this.population);
        System.out.println("Телефонный код страны: " + this.phoneCode);
        System.out.println("Название столицы: " + this.capitalCity);
        System.out.print("Города: ");
        for (String city : this.cities) {
            System.out.print(city + " ");
        }
        System.out.println();
    }

    // Методы доступа к отдельным полям
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String[] getCities() {
        return cities;
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }

    // Перегруженные методы
    public void displayData(String prefix) {
        System.out.println(prefix + " Название страны: " + this.countryName);
        System.out.println(prefix + " Название континента: " + this.continentName);
        System.out.println(prefix + " Количество жителей: " + this.population);
        System.out.println(prefix + " Телефонный код страны: " + this.phoneCode);
        System.out.println(prefix + " Название столицы: " + this.capitalCity);
        System.out.print(prefix + " Города: ");
        for (String city : this.cities) {
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
