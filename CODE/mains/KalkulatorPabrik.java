package UAP.mains;

import java.util.Scanner;
import UAP.models.Torus;
import UAP.models.Sphere;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("ELFARETA ZABRINA DEWI");
        System.out.println("245150701111015");
        System.out.println("=============================================");
      
        Torus torusDefault = new Torus();
        System.out.println(torusDefault.getName());

        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble(); 
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble(); 

        Torus torusInput = new Torus(R, r);
        System.out.println("=============================================");
        torusInput.printInfo();

        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");

        Sphere sphereDefault = new Sphere();
        System.out.println(sphereDefault.getName());

        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double r2 = sc.nextDouble(); // e.g., 21

        Sphere sphereInput = new Sphere(r2);
        System.out.println("=============================================");
        sphereInput.printInfo();
        System.out.println("=============================================");
    }
}
