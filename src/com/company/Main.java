package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
        // yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        Scanner inp = new Scanner(System.in);
        int  km,yas,tip;
        System.out.print("Mesafeyi giriniz:");
        km= inp.nextInt();
        System.out.print("Yaşınızı Giriniz:");
        yas=inp.nextInt();
        System.out.println("Yolculuk tipini Giriniz\n1-Tek Yön\n2-Gidiş Dönüş");
        tip = inp.nextInt();

        double biletpay1=km*0.10;
        double biletpay2=biletpay1-(biletpay1*0.20);

        switch (tip)
        {


            case 1:


                if (yas < 12) {
                    System.out.println("Bilet Fiyatı:" + (biletpay1-(biletpay1 * 0.50)));
                } else if (yas >= 12 && yas <= 24 ) {
                    System.out.println("Bilet Fiyatı:" + (biletpay1-(biletpay1 * 0.10)));
                } else if (yas >= 65) {
                    System.out.println("Bilet Fiyatı:" + (biletpay1-(biletpay1 * 0.30)));
                } else if (yas > 24 && yas < 65) {
                    System.out.println("Bilet Fiyatı:" + (biletpay1));
                } else {
                    System.out.println("Hatalı değer girdiniz");
                }break;

        case 2:
            

        if (yas < 12) {
            System.out.println("Bilet Fiyatı:" + (biletpay2-(biletpay2 * 0.50)));
        } else if (yas >= 12 && yas <= 24) {
            System.out.println("Bilet Fiyatı:" + (biletpay2-(biletpay2 * 0.10)));
        } else if (yas >= 65) {
            System.out.println("Bilet Fiyatı:" + (biletpay2-(biletpay2 * 0.30)));
        } else if (yas > 24 && yas < 65) {
            System.out.println("Bilet Fiyatı:" + (biletpay2));
        } else {
            System.out.println("Hatalı değer girdiniz");
        }break;

    }


    }
}
