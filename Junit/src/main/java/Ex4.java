import java.util.HashMap;

public class Ex4 {
    public static void main(String[] args) {
        System.out.print(dico("DicoMan", "Johny"));
    }

    public static String dico(String temp, String nom) {
        HashMap dictionnaire = new HashMap<>();
        dictionnaire.put("temp", temp);
        dictionnaire.put("nom", nom);
        return dictionnaire.get("temp") + " here comes " + dictionnaire.get("nom");
    }
}
