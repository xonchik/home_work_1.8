import java.time.LocalDate;

public class Main {
    ///Задание 1.
    ///Реализуйте метод, который получает в качестве параметра год, а затем проверяет,
    //является ли он високосным, и выводит результат в консоль.
    //Эту проверку вы уже реализовывали в задании по условным операторам.
    //Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
    //Результат программы выведите в консоль. Если год високосный, то должно быть выведено
    //“номер года — високосный год”. Если год не високосный, то,
    //соответственно: “номер года — не високосный год”.

    public static void calculationLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    ///Задание 2.
    ///Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
    //( 0 — iOS или 1 — Android) и год выпуска устройства.
    //В результате программа должна выводить в консоль в зависимости от исходных данных,
    //какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.

    public static void checkOsAndYear(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (os == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (os == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (os == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    ///Задание 3.
    ///Правила доставки такие:
    //Доставка в пределах 20 км занимает сутки.
    //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    //Напишите программу, которая выдает сообщение в консоль:
    //"Потребуется дней: " + срок доставки
    //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
    //Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию
    //и возвращает итоговое количество дней доставки.

    public static int deliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {
        int year = 2020;
        int clientOs = 1;
        int clientDeviceYear = 2021;
        int deliveryDistance = 21;
        calculationLeapYear(year);
        checkOsAndYear(clientOs, clientDeviceYear);
        System.out.println("Потребуется дней: " + deliveryDays(deliveryDistance));
    }
}