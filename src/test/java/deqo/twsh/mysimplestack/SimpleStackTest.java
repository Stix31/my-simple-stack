package deqo.twsh.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    private String nom;
    private int num;

    private Item itemTest = new Item();
    private SimpleStack myStack = new SimpleStack();

    @Before
    public void setUp () {
        nom = "Thomas";
        num = 1;
        itemTest.setNom(nom);
        itemTest.setNumero(1);

    }

    @Test
    public void testIsEmpty() {
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testGetSize() {
    }

    @Test
    public void testPush() {
    }

    @Test
    public void testPeek() {
    }

    @Test
    public void pop() {
    }
}