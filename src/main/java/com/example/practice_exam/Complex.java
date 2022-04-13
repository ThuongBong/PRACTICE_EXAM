package com.example.practice_exam;

import java.util.Scanner;

public class Complex {
    public double a;
    public double b;

    public Complex() {
        a = 0;
        b = 0;
    }

    public Complex(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan so thuc: ");
        a = sc.nextDouble();
        System.out.println("Nhap vap phan so ao: ");
        b = sc.nextDouble();
    }

    public void hienThi(){
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "i");
        } else {
            System.out.println(a + " + " + b + "i");
        }
    }
    //Ham cong so phuc

    public Complex add (Complex otherNumber){
        double thuc = a + otherNumber.a;
        double ao = b + otherNumber.b;
        return new  Complex(thuc, ao);
    }

    //Ham tru hai so phuc
    public Complex subtract (Complex otherNumber){
        double thuc = a - otherNumber.a;
        double ao = b - otherNumber.b;
        return new  Complex(thuc, ao);
    }

    //Ham nhan hai so phuc
    public Complex  multiply (Complex otherNumber){
        double thuc = a * otherNumber.a - b * otherNumber.b;
        double ao = a * otherNumber.b + otherNumber.a * b;
        return new  Complex(thuc, ao);
    }

    //Ham chia hai so phuc
    public Complex divide (Complex otherNumber){
        double thuc = (a * otherNumber.a + b * otherNumber.b) / (otherNumber.a * otherNumber.a + otherNumber.b * otherNumber.b);
        double ao = (otherNumber.a * b - a * otherNumber.b) / (otherNumber.a * otherNumber.a + otherNumber.b * otherNumber.b);
        return new  Complex(thuc, ao);
    }
    public void setRealPart (double realPart){
        return ;
    }

    public void setImaginaryPart (double realPart){
        return;
    }

    public double getRealPart (){
        return getRealPart();
    }

    public double getImaginaryPart (){
        return getImaginaryPart();
    }

    @Override
    public String toString() {
        String re = this.a+"";
        String im = "";
        if(this.b < 0)
            im = this.b+"i";
        else
            im = "+"+this.b+"i";
        return re+im;
    }
}
