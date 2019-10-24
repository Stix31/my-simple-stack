package deqo.twas.mysimplestack;

import java.util.EmptyStackException;

/**
 * The Stack, implement SimpleStack.
 */
public class Stack implements SimpleStack {

    /**
     * Stack.
     */
    private java.util.Stack<Item> stack;

    /**
     * Constructor.
     */
    Stack() {
        stack = new java.util.Stack<>();
    }

    /**
     * Is stack empty.
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return stack.empty();
    }

    /**
     * Get size of stack.
     * @return int
     */
    @Override
    public int getSize() {
        return stack.size();
    }

    /**
     * Put item on top of the stack.
     * @param item an Item.
     */
    @Override
    public void push(Item item) {
        stack.push(item);
    }

    /**
     * Get first Item without pop it.
     * @return Item
     * @throws EmptyStackException if stack empty.
     */
    @Override
    public Item peek() throws EmptyStackException {
        try {
            return stack.peek();
        } catch (Exception e) {
            throw new EmptyStackException();
        }
    }

    /**
     * Get first item and pop it.
     * @return Item
     * @throws EmptyStackException if stack empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        try {
            return stack.pop();
        } catch (Exception e) {
            throw new EmptyStackException();
        }
    }
}
