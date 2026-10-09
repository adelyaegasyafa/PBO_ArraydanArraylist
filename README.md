# Program ATM Sederhana (Array dan ArrayList)

Latihan eksplorasi materi **Array dan ArrayList** pada mata kuliah Pemrograman Berorientasi Objek, Program Studi Teknik Informatika, Fakultas Teknik, Universitas Mataram.

## Identitas Pembuat

| | |
|---|---|
| **NIM** | `F1D02510033` |
| **Nama** | `Adelya Ega Syafa` |
| **Kelas** | 3B |

## Deskripsi Program

Relasi antar class:

```
Bank  --(Customer[])-->  Customer  --(Account[])-->  Account
```

| Class | Keterangan |
|---|---|
| `Account` | Menyimpan saldo (`private double balance`). Method: `getBalance()`, `deposit()`, `withdraw()`. Riwayat transaksi disimpan dengan `ArrayList<String>`. |
| `Customer` | Menyimpan `firstName`, `lastName`, dan `Account[]` (maks. 5 rekening). Method: `getFirstName()`, `getLastName()`, `setAccount()`, `getAccount(index)`, `getNumOfAccounts()`. |
| `Bank` | Menyimpan `Customer[]` (maks. 10 nasabah). Method: `addCustomer()`, `getNumOfCustomers()`, `getCustomer(index)`. |
| `Main` | Menu ATM sederhana menggunakan `Scanner`. Data awal: 1 nasabah dengan 1 rekening (saldo Rp 500.000). |

## Konsep yang Dieksplorasi

- Array of objects (`Customer[]`, `Account[]`) dan akses elemen dengan index
- Iterasi array dengan `for` dan penggunaan `.length`
- `ArrayList<String>` untuk riwayat transaksi (`add`, `get`, `for-each`)
- Validasi batas index agar tidak terjadi `ArrayIndexOutOfBoundsException`

## Fitur Menu ATM

```
1. Cek saldo
2. Deposit
3. Withdraw
4. Riwayat transaksi
5. Buka rekening baru
0. Keluar
```

## Struktur Repositori

```
.
├── Account.java
├── Customer.java
├── Bank.java
├── Main.java
├── README.md
└── screenshots/
    ├── 01-menu-atm
```

## Library Tambahan

- `java.util.Scanner`
- `java.util.ArrayList`

## Cara Menjalankan

Prasyarat: JDK 8 atau lebih baru.

```bash
git clone https://github.com/<username>/<nama-repo>.git
cd <nama-repo>
javac *.java
java Main
```

### Menu ATM
<img width="960" height="540" alt="Screenshot 2026-10-10 002637" src="https://github.com/user-attachments/assets/860b82e3-1a3d-4a22-8acc-39004c082c4f" />


## Contoh Output

```
=== ATM SEDERHANA ===
Selamat datang, Ega Syafa

1. Cek saldo
2. Deposit
3. Withdraw
4. Riwayat transaksi
5. Buka rekening baru
0. Keluar
Pilihan: 1
Rekening 1: Rp 500000.0
```
