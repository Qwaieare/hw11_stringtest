public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задача 2");

        String bigFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + bigFullName);

        System.out.println();
        System.out.println("Задача 3");

        String fullNameMan = "Семёнов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullNameMan.replace("ё", "е"));

    }
}