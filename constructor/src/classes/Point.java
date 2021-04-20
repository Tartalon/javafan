package classes;

import java.util.Scanner;

public class Point {
    public double x;  // абсциса точки
    public double y;  // ордината точки

    // возврат строки с описаниемточки
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    // выводит на экран описание точки
    public void print() {
        System.out.println(this.toString());
    }
    // перемещает точку на указанный вектор
    public void move (double a, double b) {
        x = x + a;
        y = y + b;
    }
    // изменяет координаты точки на указанные
    public void set (double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создает точку с указанными пользователем координатами
    public Point() {
        boolean err;
        do {
            err = false;
            System.out.print("Введите абсцису точки: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                x = scan.nextDouble();
            } else {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                err = true;
            }
        } while (err);
        do {
            err = false;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите ординату точки: ");
            if(scan.hasNextDouble()) {
                y = scan.nextDouble();
            } else {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                err = true;
            }
        } while (err);
    }

    //конструктор создающий точку с указанными координатами
    public Point (double a, double b) {
        x = a;
        y = b;
    }

    // вычисляем расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // проверяем совпадают ли точки
    public boolean equalsPoint (Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}

class Circle {
    public double r; // радиус
    public Point c; // центр

    // возвращает строку с описанием окружности
    public String toString () {
        return "Окружность с центром в точке " + c + " и радиусом " + r;
    }
    // выводит на экран описание окружности
    public void print () {
        System.out.print(this.toString());
    }
    // перемещает центр окружности на заданный вектор
    public void move (double a, double b) {
        c.move(a, b);
    }
    // изменяет окружность, перемещая центр в указанные координаты и меняет радиус
    public void set (double a, double b, double m) {
        c.set(a,b);
        r = m;
    }
    // изменяет окружность, перемещая центр в указанные точку и меняет радиус
    public void set(Point p, double m) {
        c.set(p.x, p.y);
        r = m;
    }

    // конструктор по умолчанию, создает окружность с указанными пользователем параметрами
    Circle () {
        System.out.println("Задайте центр окружности");
        c = new Point();
        boolean err;
        do {
            err = false;
            Scanner scan = new Scanner(System.in);
            System.out.println("Задайте радиус");
            if (scan.hasNextDouble()) {
                r = scan.nextDouble();
                if (r <= 0) {
                    System.out.println("Радиус окружности должен быть положительным");
                    err = true;
                }
            } else {
                System.out.println("Вы ввели не число, попробуйте снова");
                err = true;
            }
        } while (err);
    }

    Circle (double a, double b, double m) {
        c.set(a, b);
        r = m;
    }
    // метод вычесляющий длину окружности
    public double length(Point p) {
        return 2 * Math.PI * r;
    }
    // проверяем на совпадение две окружности
    public boolean equalsCircle(Circle o) {
        if(this.r == o.r && c.equalsPoint(o.c)) {
            return true;
        } else {
            return false;
        }
    }
}

