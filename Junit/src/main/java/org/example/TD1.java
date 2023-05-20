package org.example;

public class TD1 {
    public static void main(String[] args) {

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
