package com.example.practice_exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Khai bao doi tuong
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex sp = new Complex();

        // Nhap
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap();
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap();

        // Hien thi
        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();

        sp = sp1.add(sp2);
        System.out.println("Cong:");
        sp.hienThi();
        sp = sp1.subtract(sp2);
        System.out.println("Tru:");
        sp.hienThi();
        sp = sp1.multiply(sp2);
        System.out.println("Nhan:");
        sp.hienThi();
        sp = sp1.divide(sp2);
        System.out.println("Chia:");
        sp.hienThi();

    }
}
