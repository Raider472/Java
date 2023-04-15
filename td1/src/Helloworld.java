import java.util.Scanner;
public class Helloworld {
    public static void main(String[] args) {
        System.out.println("Za Warudo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ton Nom stp");
        String nom = scanner.nextLine();
        System.out.println(nom);
        System.out.println("Nombre 1");
        int nb1 = scanner.nextInt();
        System.out.println("Nombre 2");
        int nb2 = scanner.nextInt();
        System.out.println(nb1 + nb2);
        System.out.println("Nombre 3");
        int nb3 = scanner.nextInt();
        if(nb3 % 2 == 0) {
            System.out.println("Le nombre est pair");
        }
        else {
            System.out.println("Le nombre est impair");
        }
        System.out.println("Nombre 4");
        int nb4 = scanner.nextInt();
        System.out.println("Nombre 5");
        int nb5 = scanner.nextInt();
        int nb6 = nb4;
        nb4 = nb5;
        nb5 = nb6;
        System.out.println("le nombre 4 est devenue le nb 5: " + nb4 + " et le nb 5 est devenue le nb4: " + nb5);
        System.out.println("Combien de fois veux tu executer la fonction 6 ?");
        int nbExecution = scanner.nextInt();
        ex6(nbExecution);
        System.out.println("Choisis le nombre pour le 7");
        int nbFois = scanner.nextInt();
        System.out.println(ex7(nbFois));
        System.out.println("Choisis un nombre en minute");
        int minutes = scanner.nextInt();
        int nbHeures = minutes / 60;
        int nbMinutes = minutes % 60;
        System.out.println("Voici ton temps: " + nbHeures + "H" + nbMinutes);
    }

    public static void ex6(int nbFois) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[nbFois];
        for(int i = 0; i < nbFois; i++) {
            System.out.println("Choisis le nombre num "+(i+1));
            int nbChoisis = scanner.nextInt();
            array[i] = nbChoisis;
        }
        int sommeTotale = 0;
        for(int i = 0; i<array.length; i++) {
            sommeTotale = sommeTotale + array[i];
        }
        System.out.println("Voici la somme totale: " + sommeTotale);
    }

    public static int ex7(int nombreChoisis) {
        int sommeTotale = nombreChoisis;
        for(int i = nombreChoisis-1; i > 1; i--) {
            sommeTotale = sommeTotale * i;
        }
        return sommeTotale;
    }
}
