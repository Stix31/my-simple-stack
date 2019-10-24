package deqo.twas.mysimplestack;

import java.util.EmptyStackException;

/**
 * Interface SimpleStack.
 */
public interface SimpleStack {

    /**
     * Is stack empty.
     * @return boolean.
     */
    boolean isEmpty();

    /**
     * Get size of stack.
     * @return int.
     */
    int getSize();

    /**
     * Push item.
     * @param item an Item
     */
    void push (Item item);

    /**
     * Get the first element without pop it.
     * @return Item
     * @throws EmptyStackException if stack empty.
     */
    Item peek () throws  EmptyStackException;

    /**
     * Get the first element and pop it.
     * @return Item
     * @throws EmptyStackException if stack empty.
     */
    Item pop() throws EmptyStackException;

}
