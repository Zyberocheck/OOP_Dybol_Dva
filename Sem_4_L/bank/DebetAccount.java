package SEM_1.SEM_3.SEM_4_L.bank;

public class DebetAccount<T extends PersonalData> extends Account<T> {
    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}
