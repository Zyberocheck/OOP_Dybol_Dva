package SEM_1.SEM_7.observer;

public class Vacancy extends Job {

    public Vacancy(String company, double salary, String position) {
        super(company, salary, position);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getPosition() {
        return position;
    }
    
}
