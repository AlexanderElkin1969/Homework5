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
        System.out.println("Задача 4");
    }
    public static void task5() {
        System.out.println("Задача 5");
    }
}
