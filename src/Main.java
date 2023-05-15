public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;

        switch (clientOS) {
            case 0:
                if(clientDeviceYear>=2015){
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if(clientDeviceYear>=2015){
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
    }


    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance  = 95;
        int deliveryDays = 0;
        if(deliveryDistance<20){
            deliveryDays = 1;
        } else if (deliveryDistance>=20&&deliveryDistance<60) {
            deliveryDays = 2;
        } else if (deliveryDistance>=60&&deliveryDistance<=100) {
            deliveryDays = 3;
        } else if (deliveryDistance>100) {
            deliveryDays = 0;
        }

        switch (deliveryDays) {
            case 1:
                System.out.println("Потребуется дней: "+deliveryDays);
                break;
            case 2:
                System.out.println("Потребуется дней: "+deliveryDays);
                break;
            case 3:
                System.out.println("Потребуется дней: "+deliveryDays);
                break;
            default:
                System.out.println("Доставки нет");
                break;
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

    }

    public static void task7 () {
        System.out.println("Задача 7");

    }
    public static void task8 () {
        System.out.println("Задача 8");

    }


}