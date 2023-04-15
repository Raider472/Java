import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class TD3 {
    public static void main(String[] args) {
        System.out.println(ex1(25));
        System.out.println(ex2(25, 50));
        int[] tableau = {1,2,50,89,7,45};
        System.out.println(ex3(tableau));
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
}
