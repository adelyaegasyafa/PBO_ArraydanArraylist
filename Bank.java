public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];   // kapasitas maksimal 10 nasabah
        numberOfCustomers = 0;
    }

    // return true jika nasabah berhasil ditambahkan
    public boolean addCustomer(String f, String l) {
        if (numberOfCustomers < customers.length) {
            customers[numberOfCustomers++] = new Customer(f, l);
            return true;
        }
        return false;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}