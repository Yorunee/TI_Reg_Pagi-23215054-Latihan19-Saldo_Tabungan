
package Pertemuan5;


public class Latihan19 {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000; // Saldo awal
        double bunga = 0.15; // Bunga per bulan dalam desimal (15%)
        int lama = 6; // Lama tabungan dalam bulan
        
        // Loop untuk menghitung saldo setiap bulan
        for (int i = 1; i <= lama; i++) {
            saldoAwal += saldoAwal * bunga; // Hitung saldo dengan bunga
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal); // Cetak saldo format rupiah
        }
    }
}

