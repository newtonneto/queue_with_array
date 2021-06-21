package com.company.interfaces;

import com.company.exceptions.EmptyQueueException;

public interface IQueue {
    public int size();

    public boolean isEmpty();

    public Object first() throws EmptyQueueException;

    public void getInLine(Object element);

    public Object leaveTheQueue() throws  EmptyQueueException;

    public void printQueue();
}
