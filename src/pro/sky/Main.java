package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1) print
        String firstName = "Семён";
        String middleName = "Игоревич";
        String lastName = "Орлов";
        String fullName = lastName +" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName+".");

        // 2) upper case
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());

        // 3) ё -> e
        fullName = fullName.replace('ё','е').replace('Ё','E');
        System.out.println("Данные ФИО сотрудника — "+fullName);
    }
}
