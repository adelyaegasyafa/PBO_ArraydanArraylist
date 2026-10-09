import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // data awal: 1 nasabah dengan 1 rekening
        Bank bank = new Bank();
        bank.addCustomer("Ega", "Syafa");
        Customer c = bank.getCustomer(0);
        c.setAccount(new Account(500000));

        System.out.println("=== ATM SEDERHANA ===");
        System.out.println("Selamat datang, " + c.getFirstName() + " " + c.getLastName());

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n1. Cek saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Riwayat transaksi");
            System.out.println("5. Buka rekening baru");
            System.out.println("0. Keluar");

            switch ((int) baca("Pilihan: ")) {
                case 1:
                    for (int i = 0; i < c.getNumOfAccounts(); i++) {
                        System.out.println("Rekening " + (i + 1) + ": Rp " + c.getAccount(i).getBalance());
                    }
                    break;
                case 2: {
                    Account a = pilihRekening(c);
                    if (a != null) {
                        System.out.println(a.deposit(baca("Jumlah deposit: "))
                                ? "Deposit berhasil." : "Jumlah tidak valid.");
                    }
                    break;
                }
                case 3: {
                    Account a = pilihRekening(c);
                    if (a != null) {
                        System.out.println(a.withdraw(baca("Jumlah withdraw: "))
                                ? "Withdraw berhasil." : "Gagal: saldo tidak cukup / jumlah tidak valid.");
                    }
                    break;
                }
                case 4: {
                    Account a = pilihRekening(c);
                    if (a != null) {
                        for (String h : a.getHistory()) {
                            System.out.println(" - " + h);
                        }
                    }
                    break;
                }
                case 5: {
                    double awal = baca("Saldo awal: ");
                    if (awal < 0) System.out.println("Saldo awal tidak valid.");
                    else System.out.println(c.setAccount(new Account(awal))
                            ? "Rekening baru dibuat." : "Maksimal 5 rekening.");
                    break;
                }
                case 0:
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        System.out.println("Terima kasih.");
    }

    // jika hanya 1 rekening, langsung dipakai; jika lebih, user memilih nomornya
    static Account pilihRekening(Customer c) {
        if (c.getNumOfAccounts() == 1) return c.getAccount(0);
        Account a = c.getAccount((int) baca("Nomor rekening (1-" + c.getNumOfAccounts() + "): ") - 1);
        if (a == null) System.out.println("Rekening tidak ditemukan.");
        return a;
    }

    // baca angka dari user; kembalikan -1 jika input bukan angka
    static double baca(String prompt) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}