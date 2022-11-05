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


    }
}