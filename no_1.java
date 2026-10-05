/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        //titik awal mulainya program
        int angka; // merupakan tipe data bilangan bulat
        Scanner datano_1 = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        angka = datano_1.nextInt();
        //system untuk membuat user dapat memasukkan angka
        
        int pembagian; // merupakan tipe data bilangan
        pembagian = angka % 2 ; //rumus pembagiannya
        
        if (pembagian == 0){ //jika pembagian == 0 maka
            System.out.println("Bilangan genap");//tampilkan
        } else { //jika tidak maka
            System.out.println("Bilangan ganjil");//tampilkan
        }
        // jika hasil dari pembagi 0 maka bilangan tersebut genap
        // jika hasil bukan pembagi bukan 0 maka bilangan tersebut ganjil
    }
}