package deqo.twas.mysimplestack;

import java.util.EmptyStackException;

/**
 * Interface SimpleStack.
 */
public interface SimpleStack {

    /**
     * Is stack empty
     * @return
     */
    boolean isEmpty();

    /**
     * Get size of stack.
     * @return
     */
    int getSize();

    /**
     * Push item.
     * @param item
     */
    void push (Item item);

    /**
     * Get
     * @return
     * @throws EmptyStackException
     */
    Item peek () throws  EmptyStackException;

    Item pop() throws EmptyStackException;

}
