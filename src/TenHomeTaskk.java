public class TenHomeTaskk {
    public static void main(String[] args) {
    //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " +  firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
     //task2
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
    //task3
        fullName = "Иванов Семён Семёнович";
        String name = fullName.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника - " + name);
        //System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace('ё', 'е'));
    }
}
