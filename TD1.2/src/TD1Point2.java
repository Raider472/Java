import java.util.Arrays;
import java.util.Scanner;
public class TD1Point2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabTab = {10,20,30,40,50};
        String[] tabS = {"d", "f", "i"};
        int[] tableau = new int[5];
        System.out.println("choisis l'indice");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < tableau.length) {
            System.out.println("choisis un nombre");
            int nbChoisis = scanner.nextInt();
            System.out.println("Avant la modification "+Arrays.toString(tableau));
            tableau[indice] = nbChoisis;
            System.out.println("Apres la modif "+Arrays.toString(tableau));
        }
        else {
            System.out.println("l'indice n'est pas dans la taille");
        }
        //System.out.println(ex1(tabTab, scanner));
        //System.out.println(ex2(tabTab, scanner));
    }

    public static boolean ex1(int[] tab, Scanner scanner) {
        System.out.println("Choisis le nombre num");
        int nbChoisis = scanner.nextInt();
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] == nbChoisis) {
                return true;
            }
        }
        return false;
    }

    public static int ex2(int[] tab, Scanner scanner) {
        System.out.println("Choisis le nombre num");
        int nbChoisis = scanner.nextInt();
        for(int i = 0; i < tab.length; i++) {
            if(tab[i] == nbChoisis) {
                return i;
            }
        }
        return 0;
    }
}
