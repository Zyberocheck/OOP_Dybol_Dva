package SEM_1.SEM_3.DZ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {
    private static Random random = new Random();
    static Employee employee;
    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     * @return
     */
     static void generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(200, 500);

        int randWorker = random.nextInt(2);

        if (randWorker == 0) {
            employee = new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex);
        } else if (randWorker == 1) {
            employee = new Rreelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex);}
    }

    // public static Worker[] generateWorkers(int count){
    //     Worker[] workers = new Worker[count];
    //     for (int i = 0; i < count; i++){
    //         workers[i] = generateWorker();
    //     }
    //     return workers;
    // }

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            generateEmployee();
            employees.add(employee);
        }

        // for (Employee employee : employees) {
        //     System.out.println(employee);
        // }

        // Arrays.sort(employees/*, new SalaryComparator()*/);

        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }
}
