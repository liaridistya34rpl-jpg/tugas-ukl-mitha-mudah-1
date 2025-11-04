/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanukl;

/**
 *
 * @author LOQ 11
 */import java.util.Scanner;
public class LatihanUKL {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        // Input panjang, lebar, tinggi, berat, dan jarak
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        
        // Hitung volume
        double volume = panjang * lebar * tinggi;
        
        // Hitung biaya volume
        double biayaVolume = (volume > 100) ? 50000 : 0;
        
        // Hitung biaya berat berdasarkan jarak
        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double biayaBerat = berat * biayaPerKg;
        
        // Hitung total biaya
        double totalBiaya = biayaBerat + biayaVolume;
        System.out.println("Total biaya pengiriman : "+ totalBiaya);
        
        input.close();
    }

    }

