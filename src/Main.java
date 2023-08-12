import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception{
        isLeapYear(1894);
        upgrade(1, 2015);
        int days = deliveryTime(25);
        System.out.println("Потребуется дней " + days);
    }

    public static void isLeapYear(int year) {
        System.out.println("Задача 1");
        if (year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else if (year % 100 == 0) {
            System.out.println(year + " год - не високосный год");
        } else if (year % 4 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }


    }

    public static void upgrade(int system, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (system == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите обегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (system == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите обегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
    }

    public static int deliveryTime(int distance) throws Exception {
        System.out.println("Задача 3");
        int day = 1;
        if (distance <= 20) {
            return day;
        } else if (distance < 60) {
            day++;
            return day;
        } else if (distance < 100) {
            day += 2;
            return day;
        } else {
            throw new Exception("Доставки нет");
        }

    }
}