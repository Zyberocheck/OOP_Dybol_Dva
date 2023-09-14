package SEM_1.SEM_3.DZ.Comporator;

import java.util.Comparator;

import SEM_1.SEM_3.DZ.Employee;

public class NameComporator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            res = Double.compare(o2.calculateSalary(), o1.calculateSalary());
        }
        return res;
    }
}
