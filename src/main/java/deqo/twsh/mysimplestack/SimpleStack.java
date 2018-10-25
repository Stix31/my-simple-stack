package deqo.twsh.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class SimpleStack implements SimpleStackInterface {


    private List<Item> listItem = new ArrayList<>();

    public boolean isEmpty() {
        return true;
    }

    @Override
    public int getSize() {
        return this.listItem.size();
    }


    public void push (Item item){
        this.listItem.add(0, item);
    }

    public Item peek() throws EmptyStackException {
        return this.listItem.get(getSize()-1);
    }
    public Item pop() throws EmptyStackException{
        return this.listItem.remove(0);
    }
}