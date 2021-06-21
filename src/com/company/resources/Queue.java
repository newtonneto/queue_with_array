package com.company.resources;

import com.company.exceptions.EmptyQueueException;
import com.company.interfaces.IQueue;

public class Queue implements IQueue {
    private int capacity;
    private int firstElementIndex;
    private int firstEmptyIndex;
    private Object[] arrayQueue;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.firstElementIndex = 0;
        this.firstEmptyIndex = 0;
        this.arrayQueue = new Object[capacity];
    }

    @Override
    public int size() {
        return (this.capacity - this.firstElementIndex + this.firstEmptyIndex) % this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return (this.firstElementIndex == this.firstEmptyIndex);
    }

    @Override
    public Object first() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("The queue is empty");
        } else {
            return arrayQueue[firstElementIndex];
        }
    }

    @Override
    public void getInLine(Object element) throws EmptyQueueException {
        if (this.size() == this.capacity - 1 && this.size() > 0) {
            //throw new EmptyQueueException("Fila cheia");
            this.realloc();
        }

        //Coloca o novo elemento na proxima posição vazia da fila
        this.arrayQueue[this.firstEmptyIndex] = element;
        //Passa o index de proximo para a proxima posição
        this.firstEmptyIndex = (this.firstEmptyIndex + 1) % this.capacity;
    }

    @Override
    public Object leaveTheQueue() throws EmptyQueueException {
        if (this.isEmpty()) {
            throw new EmptyQueueException("The queue is empty");
        } else {
            //Recebe o primeiro elemento da fila
            Object element = this.arrayQueue[firstElementIndex];
            //Apaga o elemento do array
            this.arrayQueue[firstElementIndex] = null;
            //Passa o index de inicio para a proxima posição
            this.firstElementIndex = (this.firstElementIndex + 1) % this.capacity;

            return element;
        }
    }

    public void printQueue() {
        for (int index = 0; index < this.capacity; index++) {
            if (this.arrayQueue[index] == null) {
                System.out.print(" - ");
            } else {
                System.out.print(" " + this.arrayQueue[index] + " ");
            }
        }
        System.out.println("\n");
    }

    public void realloc() {
        Object[] newArrayQueue = new Object[this.capacity * 2];
        int originalSize = this.size();

        for (int index = 0; index < originalSize; index++) {
            newArrayQueue[index] = this.arrayQueue[(this.firstElementIndex + index) % this.capacity];
        }

        this.firstElementIndex = 0;
        this.firstEmptyIndex = originalSize;
        this.capacity = this.capacity * 2;
        this.arrayQueue = newArrayQueue;
    }
}
