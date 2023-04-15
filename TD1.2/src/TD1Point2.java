import java.util.Scanner;
public class TD1Point2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabTab = {10,20,30,40,50};
        System.out.println(ex1(tabTab, scanner));
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
}
