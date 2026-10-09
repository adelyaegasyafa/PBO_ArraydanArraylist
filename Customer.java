public class Customer {
    private String firstName;
    private String lastName;
    private Account[] accounts = new Account[5];   // array, maksimal 5 rekening
    private int numberOfAccounts = 0;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // return true jika rekening berhasil ditambahkan
    public boolean setAccount(Account acct) {
        if (numberOfAccounts < accounts.length) {
            accounts[numberOfAccounts++] = acct;
            return true;
        }
        return false;
    }

    public Account getAccount(int accountIndex) {
        if (accountIndex >= 0 && accountIndex < numberOfAccounts) {
            return accounts[accountIndex];
        }
        return null;
    }

    public int getNumOfAccounts() {
        return numberOfAccounts;
    }
}