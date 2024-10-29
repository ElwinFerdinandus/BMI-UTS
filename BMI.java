/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author WINDOWS 10
 */
public class BMI {

    double tinggi;
    double berat;

    public BMI(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }

    public void status() {
        double bmi = berat / (tinggi * tinggi);
        if (bmi < 18.5) {
            System.out.println("Status anda : kurus");
        } else if (bmi < 25) {
            System.out.println("Status anda : normal");
        } else if (bmi < 30) {
            System.out.println("Status anda : gemuk");
        } else {
            System.out.println("Status anda : obesitas");
        }
        System.out.printf("bmi anda : %.1f%n",bmi);
    }
}
