public class Main {
    public static void main(String[] args) {

        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        // Задание 3
        String fullName3 = "Иванов Семён Семёнович";
        String fullNameE = fullName3.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullNameE);

    }
}