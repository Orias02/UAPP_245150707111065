package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        System.out.print("Isikan Radius   : ");
        double rLuar = input.nextDouble();
        System.out.print("Isikan radius   : ");
        double rDalam = input.nextDouble();

        Torus torus = new Torus(rLuar, rDalam);
        torus.hitungVolume();
        torus.hitungLuasPermukaan();
        torus.hitungMassa();

        torus.printInfo();
        System.out.printf("Massa dalam kg  : %.2f\n", torus.getMassaKg());
        System.out.println("Biaya kirim     : Rp" + torus.hitungBiayaKirim());
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");

        System.out.print("Isikan radius   : ");
        double rBola = input.nextDouble();

        Sphere sphere = new Sphere(rBola);
        sphere.hitungVolume();
        sphere.hitungLuasPermukaan();
        sphere.hitungMassa();

        sphere.printInfo();
        System.out.printf("Massa dalam kg  : %.2f\n", sphere.getMassaKg());
        System.out.println("Biaya kirim     : Rp" + sphere.hitungBiayaKirim());
        System.out.println("=============================================");
        
        input.close();
    }
}
