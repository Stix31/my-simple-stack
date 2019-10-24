package deqo.twas.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;
    @Before
    public void setup() {
        item = new Item();
    }
    @Test
    public void getValue() {
        //Given
        item = new Item();
        //When
        item.setValue(10);
        //Then
        assertEquals(10, item.getValue());
    }

    @Test
    public void setValue() {
        //Given
        item = new Item();
        //When
        item.setValue(10);
        //Then
        assertEquals(10, item.getValue());
    }
}