//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");

        short iOSOrAndroid = 2;

        if (iOSOrAndroid == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (iOSOrAndroid == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Введите 0 или 1");
        }

        //Task 2
        System.out.println("Task 2");

        iOSOrAndroid = 1;
        int clientDeviceYear = 2014;

        if (iOSOrAndroid == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (iOSOrAndroid == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (iOSOrAndroid == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println("Task 3");

        int year = 1584;

        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
        }

        //Task 4
        System.out.println("Task 4");

        int deliveryDistance = 100;
        int days;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance <= 100) {
            days = 3;
        } else {
            days = -1;
        }

        if (days == -1) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }

        //Task 5
        System.out.println("Task 5");

        int monthNumber = 13;

        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println(monthNumber + "-й месяц относится к сезону зима");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + "-й месяц относится к сезону весна");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + "-й месяц относится к сезону лето");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + "-й месяц относится к сезону осень");
                break;
            default:
                System.out.println("Выберете корректный месяц");
        }
    }
}