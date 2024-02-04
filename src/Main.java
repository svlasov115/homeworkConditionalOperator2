public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Приложение недоступно для операционной системы на Вашем устройстве.");
        }

        // Задача 2
        System.out.println("Задача 2");

        clientOS = 0;
        int clientDeviseYear = 2015;
        int borderYear = 2015;

        if (clientOS == 0 && clientDeviseYear >= borderYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviseYear < borderYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviseYear >= borderYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1 && clientDeviseYear < borderYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Приложение недоступно для операционной системы на Вашем устройстве.");
        }

        // Задача 3
        System.out.println("Задача 3");

        int year = 2024;
        int yearOfLeapYearIntroduction = 1584;

        if (year % 4 == 0 && year > yearOfLeapYearIntroduction && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "-ый год является високосным.");
        } else {
            System.out.println(year + "-ый год не является високосным.");
        }

        // Задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;
        int dayOfDelivery = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayOfDelivery++;
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayOfDelivery = dayOfDelivery + 2;
            System.out.println("Потребуется дней: " + dayOfDelivery + ".");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        // Задача 5
        System.out.println("Задача 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-ый месяц в году — это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-ый месяц в году — это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-ый месяц в году — это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-ый месяц в году — это осенний месяц.");
                break;
            default:
                System.out.println("Номер месяца больше 12.");
        }
    }
}