import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = {8,7,10,9,15,11};
        int[] tableauTrie = ex1(tableau);
        System.out.println(Arrays.toString(tableauTrie));
        String[] tabString = {"b", "a", "p", "f", "o"};
        String[] tableauTrieString = ex2(tabString);
        System.out.println(Arrays.toString(tableauTrieString));
        ArrayList<String> tabEleve = ex3(scanner);
        System.out.println(tabEleve.toString());
    }

    public static int[] ex1(int[] tab) {
        int nbConserve = 0;
        int indiceConserve = 0;
        int nbMax = 0;
        int nbTrie = 0;
        for(int i = 0; i<tab.length-1; i++) {
            if(nbMax < tab[i]) {
                nbMax = tab[i];
            }
        }
        nbTrie = nbMax;
        for(int i = 0, j = 0; j < tab.length-1; i++) {
            if (j == 0 && nbTrie > tab[i]) {
                nbTrie = tab[i];
                indiceConserve = i;
            }
            else if (nbTrie > tab[i] && tab[i] > tab[j-1]) {
                nbTrie = tab[i];
                indiceConserve = i;
            }
            if (i == tab.length-1) {
                nbConserve = tab[j];
                tab[j] = nbTrie;
                nbTrie = nbMax;
                tab[indiceConserve] = nbConserve;
                j++;
                i = -1;
            }
        }
        return tab;
    }

    public static String[] ex2(String[] tabString) {
        for(int i = 0; i < tabString.length; i++) {
            for (int j = i+1; j < tabString.length; j++) {
                if (tabString[i].compareTo(tabString[j]) > 0) {
                    String temp = tabString[i];
                    tabString[i] = tabString[j];
                    tabString[j] = temp;
                }
            }
        }
        return tabString;
    }

    public static ArrayList<String> ex3(Scanner scanner) {
        ArrayList<String> tabEleveString = new ArrayList<String>();
        for(int i = 0; i < 5; i++) {
            System.out.println("Choisis le nom de ton élève num"+(i+1));
            String choixEleve = scanner.nextLine();
            tabEleveString.add(choixEleve);
        }
        tabEleveString.sort(Comparator.naturalOrder());
        return tabEleveString;
    }
}
