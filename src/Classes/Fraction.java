package Classes;/*
Задание 4
Создайте класс «Дробь».
Необходимо хранить в полях класса:
числитель и знаменатель.
Реализуйте методы класса
- для ввода данных,
- вывода данных,
- реализуйте доступ к отдельным полям через методы класса.
Также создайте методы класса для выполнения арифметических операций
(сложение, вычитание, умножение, деление, и т.д.).

К уже реализованному классу «Дробь» добавьте не-
обходимые конструкторы, а также необходимые перегру-
женные методы.
 */

import java.util.Objects;

public final class Fraction {
    private int numerator;
    private int denominator;

    // Конструктор по умолчанию
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Конструктор с 1 параметром
    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    // Конструктор с 2 параметрами
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator is zero.");
        }
        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        if (denominator < 0) {
            this.numerator = -1 * this.numerator;
            this.denominator = -1 * this.denominator;
        }
    }

    // Конструктор копирования
    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    // Методы доступа к полям
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Метод для вывода данных
    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    // Метод для сложения дробей 1
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для сложения дробей 2
    public static Fraction add(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator + f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
    }

    // Метод для вычитания дробей 1
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для вычитания дробей 2
    public static Fraction subtract(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator - f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
    }

    // Метод для умножения дробей 1
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Метод для умножения дробей 1
    public static Fraction multiply(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.numerator,
                f1.denominator * f2.denominator);
    }

    // Метод для деления дробей 1
    public Fraction divide(Fraction other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
    // Метод для деления дробей 2
    public static Fraction divide(Fraction f1, Fraction f2) {
        return new Fraction(f1.numerator * f2.denominator,
                f1.denominator * f2.numerator);
    }

    @Override
    public String toString() {
        if (denominator != 1) {
            return numerator + "/" + denominator;
        } else {
            return Integer.toString(numerator);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
