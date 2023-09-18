package SEM_1.SEM_3.SEM_4_L.bank;

public class CreditAccount<T extends PersonalData> extends Account<T> {
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
