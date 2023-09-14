package SEM_1.SEM_3.DZ;

public class Rreelancer extends Employee {
    public Rreelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }
    
    @Override
    public double calculateSalary() {
        return salary * 22;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Удаленный сотрудник; зарплата за месяц: %.2f",
                surName, name, salary);
    }


}
