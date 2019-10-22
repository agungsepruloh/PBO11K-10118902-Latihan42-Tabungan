package com.pbo;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * NIM   : 10118902
 * Kelas : IF-11K
 * Deskripsi Program : program ini berguna untuk menghitung nilai sisa tabungan setelah diambil
 *
 */

import java.util.Scanner;

public class Tabungan {

    private int saldo;

    public int getSaldo() {
        return saldo;
    }

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        return getSaldo() - jumlah;
    }

    public static void main(String[] args) {

        System.out.println("===== Program Penarikan Uang =====");
        System.out.print("Masukkan saldo awal\t\t\t: ");
        Scanner scanner = new Scanner(System.in);
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang diambil\t: ");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(String.format("Saldo anda sekarang\t\t\t: Rp %,3d", tabungan.ambilUang(scanner1.nextInt())));
    }
}
