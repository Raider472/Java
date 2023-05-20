public class Personnes {
    String nom;
    String prenom;

    int age;

    public static void main(String[] args) {
        Personnes Jean = new Personnes();
        Jean.setNom("Jean");
        Jean.setPrenom("Valjean");
        Jean.setAge(58);
        System.out.print(Jean.toString());
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.getNom() + " " + this.getPrenom() + " " + String.valueOf(this.getAge());
    }
}
