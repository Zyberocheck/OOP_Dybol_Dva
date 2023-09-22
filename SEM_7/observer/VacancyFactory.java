package SEM_1.SEM_7.observer;

import java.util.Random;

public class VacancyFactory implements JobFactory {

    private String name;
    private double maxSalary;
    private Random random;

    public VacancyFactory(String name, double maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.random = new Random();
    }

    @Override
    public Vacancy createVacancy(String position) {
        return new Vacancy(name,
                random.nextDouble(2000, maxSalary), position);
    }

}
