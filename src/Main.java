public class Main {
    public static void main(String[] args) {

        //Task 1

        int clientOS = 0;

        if (clientOS == 0) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1) {

            System.out.println("Установите версию приложения для Android по ссылке");

        } else {

            System.out.println("Некорректная ОС");

        }

        //Task 2

        clientOS = 0;
        int yearOS = 2015;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < yearOS) {

            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && clientDeviceYear >= yearOS) {

            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 1 && clientDeviceYear < yearOS) {

            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (clientOS == 1 && clientDeviceYear >= yearOS) {

            System.out.println("Установите версию приложения для Android по ссылке");

        } else {

            System.out.println("Некорректная ОС");

        }

    }

}