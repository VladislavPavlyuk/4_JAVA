package Classes;
/*
Задание 5
Реализуйте класс «Книга».
Необходимо хранить в полях класса:
- название книги,
- ФИО автора,
- год выпуска,
- название издательства,
- жанр книги,
- количество страниц.
Реализуйте конструкторы и методы класса для ввода
данных, вывода данных, реализуйте доступ к отдельным
полям через методы класса. Используйте механизм пере-
грузки методов.
 */

import java.util.Scanner;

public class Book {
    private String title; //название книги
    private String author; //ФИО автора
    private int year; //год выпуска
    private String publisher; //название издательства
    private String genre; //жанр книги
    private int pages; //количество страниц

    // Дефолтный конструктор
    public Book() {
        this.title = "";
        this.author = "";
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.pages = 0;
    }

    // Конструктор с параметрами
    public Book(String title, String author, int year, String publisher, String genre, int pages) {
        this();
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = pages;
    }

    // Конструктор копирования
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.publisher = other.publisher;
        this.genre = other.genre;
        this.pages = other.pages;
    }

    // Методы для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();

        System.out.print("Введите имя автора: ");
        this.author = scanner.nextLine();

        System.out.print("Введите год издания: ");
        this.year = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите название Издателя: ");
        this.publisher = scanner.nextLine();

        System.out.print("Введите жанр: ");
        this.genre = scanner.nextLine();

        System.out.print("Введите количество страниц: ");
        this.pages = Integer.parseInt(scanner.nextLine());
    }

    // Методы для ввода данных
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Методы для вывода данных
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    // Метод для вывода всех данных
    public void printBookInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
        System.out.println("Издательство: " + publisher);
        System.out.println("Жанр: " + genre);
        System.out.println("Количество страниц: " + pages);
    }
}
