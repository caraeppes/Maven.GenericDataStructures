package StackArray;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void push(Object object) {
        Object[] pushedArray = new Object[elements.length + 1];
        System.arraycopy(elements, 0, pushedArray, 0, elements.length);
        pushedArray[elements.length] = object;
        elements = pushedArray;
    }

    public Object pop() throws IndexOutOfBoundsException {
        if(!isEmpty()){
            Object poppedElement = elements[elements.length - 1];
            Object[] poppedArray = new Object[elements.length - 1];
            System.arraycopy(elements, 0, poppedArray, 0, poppedArray.length);
            elements = poppedArray;
            return poppedElement;
        }
        else {
            throw new IndexOutOfBoundsException("Error.  Cannot pop an empty Stack!");
        }
    }
}
