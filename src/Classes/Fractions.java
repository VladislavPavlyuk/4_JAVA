package Classes;

import java.util.Objects;
import java.util.Scanner;

public final class Fractions {
    private int numerator;
    private int denominator;

    // Конструктор по умолчанию
    public Fractions() {
        this.numerator = 0;
        this.denominator = 1;
    }

    // Конструктор с 1 параметром
    public Fractions(int num) {
        this();
        this.numerator = num;
        this.denominator = 1;
    }

    // Конструктор с 2 параметрами
    public Fractions(int numerator, int denominator) {
        this(numerator);
        this.denominator = denominator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }

        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
        }
        if (denominator < 0) {
            this.numerator = -1 * this.numerator;
            this.denominator = -1 * this.denominator;
        }
    }

    // Конструктор копирования
    public Fractions(Fractions other) {
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
        System.out.println(numerator + "/" + denominator);
    }


    // Метод для сложения дробей
    public static Fractions addFraction(Fractions f1, Fractions f2) {
        if ((f1.denominator != 0)&&(f2.denominator != 0)) {
        return new Fractions(f1.numerator * f2.denominator + f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
        } else  {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для вычитания дробей
    public static Fractions subtract(Fractions f1, Fractions f2) {
        if ((f1.denominator != 0)&&(f2.denominator != 0)) {
        return new Fractions(f1.numerator * f2.denominator - f2.numerator * f1.denominator,
                f1.denominator * f2.denominator);
        } else  {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для умножения дробей
    public static Fractions multiply(Fractions f1, Fractions f2) {
        if ((f1.denominator != 0)&&(f2.denominator != 0)) {
        return new Fractions(f1.numerator * f2.numerator,
                f1.denominator * f2.denominator);
        } else  {
            throw new IllegalArgumentException("Error! The denominator is zero.");
        }
    }

    // Метод для деления дробей 2
    public static Fractions divide(Fractions f1, Fractions f2) {
        if ((f1.denominator != 0)&&(f2.denominator != 0)) {
            return new Fractions(f1.numerator * f2.denominator,
                    f1.denominator * f2.numerator);
        } else  {
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
        Fractions fraction = (Fractions) obj;
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

