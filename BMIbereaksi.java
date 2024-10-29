/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class BMIbereaksi {

    public static void main(String[] args) {
        Scanner inputanku = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Selamat Datang di aplikasi BMI");
        System.out.println("**********ElwinFerdinandus*************");
        System.out.println("          m3nyalaa Abangku        ");
        System.out.print("\n masukan tinggi badan anda :");
        double tinggi = inputanku.nextDouble();
        System.out.print("masukan berat badan anda:");
        double berat = inputanku.nextDouble();
        BMI bmi = new BMI(tinggi, berat);
        bmi.status();
    }

}
