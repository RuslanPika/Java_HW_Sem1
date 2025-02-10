package example6;

import java.util.Arrays;
/**
 * Lesson_7
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class MyArrayList<T> {

    private static final int MAX_SIZE = 10;
    private T[] elements; // массив для хранения элементов
    private int count;

    public MyArrayList() {
        this.elements = (T[])new Object[MAX_SIZE];
    }

    public void add(T element) {
        if (count == elements.length) {
            resize(); //
        }
        elements[count++] = element;

    }


    public void remove(int index) {
        for (int i = index; i < this.elements.length-1; i++) {
            if (i == index) {
                this.elements[i] = null;
                this.count--;
            }
            this.elements[i] = this.elements[i+1];
        }
    }

    private void resize() {
        int newSize = (int) (elements.length * 1.5);
        elements = Arrays.copyOf(elements, newSize);
    }


    public int size() {
        return count;
    }


    public T get(int index) {
        return this.elements[index];
}}
