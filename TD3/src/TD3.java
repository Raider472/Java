import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class TD3 {
    public static void main(String[] args) {
        ex4();
    }

    public static double ex1(int nombre) {
        double carré = Math.sqrt(nombre);
        return carré;
    }

    public static int ex2(int fisrt, int second) {
        if(fisrt > second) {
            return fisrt;
        }
        else {
            return second;
        }
    }

    public static int ex3(int[] tab) {
        int sommeTotal = 0;
        for(int i = 0; i < tab.length; i++) {
            sommeTotal = sommeTotal + tab[i];
        }
        return sommeTotal;
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuilez choisir votre fonction");
        int fonction = scanner.nextInt();
        if(fonction == 1) {
            System.out.println("Veuilez choisir un nombre pour le carré");
            int nombre = scanner.nextInt();
            System.out.println(ex1(nombre));
        }
        else if(fonction == 2) {
            System.out.println("Veuilez choisir un 1er nombre");
            int nombre1 = scanner.nextInt();
            System.out.println("Veuilez choisir un 2ème nombre");
            int nombre2 = scanner.nextInt();
            System.out.println(ex2(nombre1, nombre2));
        }
        else if(fonction == 3) {
            int[] tableau = {1,2,50,89,7,45};
            System.out.println(ex3(tableau));
        }
    }
}
