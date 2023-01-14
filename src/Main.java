public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        int clientOS = 0;
        System.out.println("Задача 1");
        if (clientOS ==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS ==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибка ввода данных, переменная clientOS может принимать только два значения 0 или 1");
        }
     }
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear =2011;
        System.out.println("Задача 2");
        if (clientOS ==0) {
            if (clientDeviceYear >= 2015) System.out.println("Установите версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS ==1){
            if (clientDeviceYear >= 2015) System.out.println("УУстановите версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
            System.out.println("Ошибка ввода данных, переменная clientOS может принимать только два значения 0 или 1");
        }
    }
    public static void task3() {
        int year =2000;
        System.out.println("Задача 3");
        if (year%4 ==0 && year%100 !=0 || year%400 ==0){
            System.out.println(year +" год является високосным");
        }else {
            System.out.println(year +" год не является високосным");
        }
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays = 0;
        System.out.println("Задача 4");
        if (deliveryDistance<=20){
            deliveryDays =deliveryDays +1;
        } else if (deliveryDistance <=60) {
            deliveryDays =deliveryDays +2;
        } else if (deliveryDistance <=100) {
            deliveryDays =deliveryDays +3;
        }else {
            System.out.println("Доставка не осуществляется");
        }

        if (deliveryDays !=0) System.out.println("Потребуется дней: "+ deliveryDays);
    }
    public static void task5() {
        int monthNumber = 10;
        System.out.println("Задача 5");
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка ввода данных. В году только 12 месяцев");
        }
    }
}
