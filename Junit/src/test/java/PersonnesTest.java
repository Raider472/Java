import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnesTest {

    @Test
    void setNom() {

    }

    @Test
    void getNom() {
    }

    @Test
    void setPrenom() {
    }

    @Test
    void getPrenom() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getAge() {
    }

    @Test
    void testToString() {
        Personnes Jean = new Personnes();
        Jean.setNom("Jean");
        Jean.setPrenom("Valjean");
        Jean.setAge(58);
        assertEquals("Jean Valjean 58", Jean.toString());
    }
}