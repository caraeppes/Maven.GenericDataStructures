package StackArray;

import java.lang.reflect.Array;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[]{};
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void push(E element) {
       E[] pushedArray = (E[]) Array.newInstance(elements.getClass().getComponentType(), elements.length + 1);
        System.arraycopy(elements, 0, pushedArray, 0, elements.length);
        pushedArray[elements.length] = element;
        elements = pushedArray;
    }

    public E pop() throws IndexOutOfBoundsException {
        if(!isEmpty()){
           E poppedElement = elements[elements.length - 1];
            E[] poppedArray = (E[]) Array.newInstance(elements.getClass().getComponentType(), elements.length - 1);
            System.arraycopy(elements, 0, poppedArray,0, poppedArray.length);
            elements = poppedArray;
            return poppedElement;
        }
        else {
            throw new IndexOutOfBoundsException("Error.  Cannot pop an empty Stack!");
        }
    }


}
