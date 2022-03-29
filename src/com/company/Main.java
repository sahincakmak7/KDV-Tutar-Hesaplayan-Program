package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double amount , kdvAmount, kdvWıthAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        amount = input.nextInt();

        if (amount <= 1000) {
            double kdvRatio = 0.18;
            kdvAmount = amount * kdvRatio;
            kdvWıthAmount = amount + kdvAmount;

            System.out.println("KDV'siz tutar: " + amount);
            System.out.println("KDV oranı: " + kdvRatio);
            System.out.println("KDV tutarı: " + kdvAmount);
            System.out.println("KDV'li tutarı: " + kdvWıthAmount);
            return;
        } else ;
        double kdvRatio = 0.8;
        kdvAmount = amount * kdvRatio;
        kdvWıthAmount = amount + kdvAmount;

        System.out.println("KDV'siz tutar: " + amount);
        System.out.println("KDV oranı: " + kdvRatio);
        System.out.println("KDV tutarı: " + kdvAmount);
        System.out.println("KDV'li tutarı: " + kdvWıthAmount);


    }
}
