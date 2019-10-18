package deqo.twas.mysimplestack;

import java.util.EmptyStackException;

public class Stack implements SimpleStack {

    private java.util.Stack<Item> stack;

    public Stack() {
        stack = new java.util.Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return stack.empty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        try {
            return (Item) stack.peek();
        } catch (Exception e) {
            System.out.println("No item");
        }
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        try {
            return (Item) stack.pop();
        } catch (Exception e) {
            System.out.println("No item");
        }
        return null;
    }
}
