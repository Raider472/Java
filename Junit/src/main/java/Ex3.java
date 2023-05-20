public class Ex3 {

    public static void main(String[] args) {
        boucle();
    }

    public static void boucle() {
        for(int i = 0; i < 100; i++) {
            if(i % 5 == 0 && i % 3 == 0 && i != 0 ) {
                System.out.print("FizzBuzz\n");
            }
            else if(i % 5 == 0 && i != 0) {
                System.out.print("Buzz\n");
            }
            else if(i % 3 == 0 && i != 0) {
                System.out.print("Fizz\n");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
