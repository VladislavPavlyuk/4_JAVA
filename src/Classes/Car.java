package Classes;/*
Задание 6
Реализуйте класс «Автомобиль». Необходимо хранить
в полях класса:
название автомобиля,
название производителя,
год выпуска,
объём двигателя.
Реализуйте конструкторы и методы класса для ввода данных, вывода данных,
реализуйте доступ к отдельным полям через методы класса.
Используйте механизм перегрузки методов.
 */

public class Car {
    private String name;
    private String manufacturer;
    private int year;
    private double engineVolume;

    // Дефолтный конструктор
    public Car() {
        this.name = "Unknown";
        this.manufacturer = "Unknown";
        this.year = 0;
        this.engineVolume = 0.0;
    }

    // Конструктор с параметрами
    public Car(String name, String manufacturer, int year, double engineVolume) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    // Конструктор копирования
    public Car(Car other) {
        this.name = other.name;
        this.manufacturer = other.manufacturer;
        this.year = other.year;
        this.engineVolume = other.engineVolume;
    }

    // Методы для ввода данных
    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    // Методы для вывода данных
    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    // Перегрузка методов
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Engine Volume: " + engineVolume);
    }

    public void printInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Detailed Info:");
        }
        printInfo();
    }
}
