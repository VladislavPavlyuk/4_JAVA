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
import java.util.Scanner;

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
        this();
        this.numerator = num;
        this.denominator = 1;
    }

    // Конструктор с 2 параметрами
    public Fraction(int numerator, int denominator) {
        this(numerator);
        this.denominator = denominator;
        if (denominator != 0) {
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
        }} else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
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
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для вывода данных
    public void print() {
        //System.out.println(numerator + "/" + denominator);
        if (denominator != 0) {
            if  (denominator != 1) {
                System.out.println(numerator + "/" + denominator);
            } else {
                System.out.println(numerator);
            }
        } else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для сложения дробей
    public Fraction add(Fraction other) {
        if ((denominator != 0)&&(other.denominator != 0)) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
        } else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для вычитания дробей
    public Fraction subtract(Fraction other) {
        if ((denominator != 0)&&(other.denominator != 0)) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
        } else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для умножения дробей
    public Fraction multiply(Fraction other) {
        if ((denominator != 0)&&(other.denominator != 0)) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        } else {
                throw new IllegalArgumentException("Error! The denominator is zero.");
            }
    }

    // Метод для деления дробей
    public Fraction divide(Fraction other) {
        if ((denominator != 0)&&(other.denominator != 0)) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);}
        else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    @Override
    public String toString() {
        if (denominator != 0) {
                if  (denominator != 1) {
                return numerator + "/" + denominator;
            } else {
                return Integer.toString(numerator);
            }
        } else {
            throw new IllegalArgumentException("Error! The denominator is zero.");
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

    // Методы для ввода данных
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числитель : ");
        this.numerator = Integer.parseInt(scanner.nextLine());

        int temp;
        do  {
            System.out.print("Введите знаменатель : ");
            temp = Integer.parseInt(scanner.nextLine());
            if (temp == 0) {
                System.out.println("Error! The denominator is zero. Please try again!");
            }
        } while (temp == 0);
        this.denominator = temp;
    }
}
