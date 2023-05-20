public class ex5 {

    public static void main(String[] args) {
        romain();
    }

    public static  void romain() {
        String unité = "";
        String dizaine = "";
        String centaine = "";
        for(int i = 1; i < 101; i++) {
            if(i % 10 == 4) {
                unité = "IV";
            }
            else if(i % 5 == 0 && i % 10 != 0) {
                unité = "V";
            }
            else if (i % 10 == 9) {
                unité = "IX";
            }
            else if (i % 10 == 0 && i % 100 != 0) {
                if (i < 50) {
                    dizaine = "";
                    for (int j = 0, c = i/10; j < c; j++) {
                        dizaine += "X";
                    }
                }
                else {
                    dizaine = "L";
                    for (int j = 0, c = i/10/2; j < c; j++) {
                        dizaine += "X";
                    }
                }
                unité = "";
            }
            else if (i >= 100) {
                unité = "";
                dizaine = "";
                centaine = "C";
            }
            else {
                unité += "I";
            }
            System.out.print(centaine + dizaine + unité);
            System.out.print("\n");
        }
    }
}
