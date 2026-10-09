import java.util.ArrayList;

public class Account {
    private double balance;
    // ArrayList dipakai untuk riwayat transaksi (ukurannya dinamis)
    private ArrayList<String> history = new ArrayList<String>();

    public Account(double initBalance) {
        balance = initBalance;
        history.add("Rekening dibuka, saldo awal: " + initBalance);
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            history.add("Deposit  : +" + amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            history.add("Withdraw : -" + amount);
            return true;
        }
        return false;
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}