public class Main {
    public static void main(String[] args){
        // Задание 1
        System.out.println(" Задание 1. ");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println(" Задание 2. ");
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        }
        if (clientDeviceYear >= 2015 + clientOS) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        // Задание 5
        System.out.println("Задание 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            case 12:
                System.out.println(" Зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");

        }
        // Задание 3.
        System.out.println( "Задание 3 ");
        int year = 2020;
        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " год является високосным. ");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " год является високосным .");
        }
        else
        {
            System.out.println(year + " год не является високосным .");
        }
        // Задание 4
        System.out.println(" Задание 4 ");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20 ) {
            System.out.println( "Потребуется дней:" +deliveryTime + " срок доставки");
            }
        else if (deliveryDistance> 20 && deliveryDistance <= 60 ) {
            System.out.println( "Потребуется дней:" + ( deliveryTime +1) + " срок доставки " );
        }
        else if (deliveryDistance> 60 && deliveryDistance <= 100) {
            System.out.println( "Потребуется дней:" + ( deliveryTime +2) + " срок доставки " );
        }

        }
    }



