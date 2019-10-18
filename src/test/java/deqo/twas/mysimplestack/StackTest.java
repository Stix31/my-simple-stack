package deqo.twas.mysimplestack;

import org.junit.Before;
import org.junit.Test;
import sun.java2d.pipe.SpanShapeRenderer;

import static org.junit.Assert.*;

public class StackTest {

    private SimpleStack stack;
    private Item item10;
    private Item item20;
    private Item item30;
    private Item item40;
    @Before
    public void setup() {
        stack = new Stack();
        item10 = new Item();
        item20 = new Item();
        item30 = new Item();
        item40 = new Item();
        item10.setValue(10);
        item20.setValue(20);
        item30.setValue(30);
        item40.setValue(40);
    }

    @Test
    public void isEmpty() {
        //Given
        //empty stack
        //When
        stack = new Stack();
        //Then
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void getSize() {
        //Given
        //empty stack
        //When
        stack.push(item10);
        //Then
        assertEquals(1, stack.getSize());
    }

    @Test
    public void push() {
        //Given
        //empty stack
        //When
        stack.push(item30);
        //Then
        assertEquals(30, stack.pop().getValue());
    }

    @Test
    public void peek() {
        //Given
        //empty stack
        //When
        stack.push(item30);
        stack.push(item20);
        //Then
        assertEquals(20, stack.peek().getValue());
    }

    @Test
    public void pop() {
        //Given
        //empty stack
        //When
        stack.push(item40);
        //Then
        assertEquals(40, stack.pop().getValue());
    }
}