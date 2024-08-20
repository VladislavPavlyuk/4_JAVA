import Classes.*;

import static Classes.Fraction.*;
import static Classes.Fractions.addFraction;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// Пример использования класса Human
        Human human1 = new Human();
        human1.inputData();
        human1.displayData();

        Human human2 = new Human("John Winston Lennon",
                "09.10.1940",
                "1234567890",
                "Liverpool",
                "England",
                "Obbey road");
        human2.displayData("Data: ");

        Human human3 = new Human(human2);
        human3.displayData("Copy: ");


// Пример использования класса City
        City city1 = new City();
        city1.inputData();
        city1.displayData();

        City city2 = new City("Братислава",
                "Братиславский край",
                "Словакия",
                437725,
                "811 01",
                "02");
        city2.displayData("Данные: ");

        City city3 = new City(city2);
        city3.displayData("Копия: ");


// Пример использования класса Country
        Country country1 = new Country();
        country1.inputData();
        country1.displayData();

        String[] cities = {"Братислава", "Кошице", "Прешов"};
        Country country2 = new Country("Словакия",
                "Европа",
                5456362,
                "+421",
                "Братислава",
                cities);
        country2.displayData("Данные: ");

        Country country3 = new Country(country2);
        country3.displayData("Копия: ");

        Fractions f1 = new Fractions();
        f1.setNumerator(2);
        f1.setDenominator(3);
        f1.print();


        Fraction f2 = new Fraction(5);
        f2.print();


        Fraction f3 = new Fraction(3,4);
        System.out.println(f3.toString());

        System.out.println(f1.equals(f2));
        System.out.println(f2.equals(f3));


        System.out.println(f2.hashCode());

            Fraction f4 = new Fraction();
            f4.inputData();

            System.out.println(f4);

            System.out.println(f4.add(f2));

            System.out.println(f4.subtract(f3));

            System.out.println(f4.multiply(f3));

            System.out.println(f4.divide(f3));

            System.out.println(f3.equals(f3));



        // Пример использования класса Book
        Book book = new Book();
        book.inputData();
        book.printBookInfo();

        Book book1 = new Book(
                "Название книги",
                "Автор ФИО",
                2023,
                "Издательство",
                "Жанр",
                300);

        book1.printBookInfo();

        Book book2 = new Book();
        book2.setAuthor("Война и Мир");
        book2.setAuthor("Лев Толстой");
        book2.setYear(1871);
        book2.setPublisher("Издательство");
        book2.setPages(800);

        book2.printBookInfo();
        book1 = book2;

        book1.printBookInfo();


        Car car = new Car();
        car.inputData();
        car.printInfo();
        car.printInfo(true);

        Car car1 = new Car();
        car1.setName("Corolla");
        car1.setYear(2006);
        car1.setManufacturer("Toyota");
        car1.setEngineVolume(1.8);
        car1.printInfo();
        car1.printInfo(true);

        Car car2 = new Car(
                "Model S",
                "Tesla",
                2020,
                2.0);
        car2.printInfo(true);


        Car car3 = new Car(car2);
        car3.printInfo();
        car3.printInfo(true);
    }
}
