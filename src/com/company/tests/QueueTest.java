package com.company.tests;

import com.company.interfaces.ITest;
import com.company.resources.Queue;

public class QueueTest implements ITest {
    Queue queue;

    public QueueTest() {
        this.queue = new Queue(5);
    }

    @Override
    public void executeTestOne() {
        queue.getInLine(1);
        queue.getInLine(2);

        queue.printQueue();

        queue.getInLine(3);
        queue.getInLine(4);
        queue.leaveTheQueue();

        queue.printQueue();

        queue.getInLine(5);
        queue.getInLine(6);

        queue.printQueue();

        queue.getInLine(7);
        queue.getInLine(8);

        queue.printQueue();

        queue.getInLine(9);
        queue.leaveTheQueue();
        queue.getInLine(0);
        queue.getInLine(1);
        queue.getInLine(2);

        queue.printQueue();

        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();
        queue.leaveTheQueue();

        queue.printQueue();

        queue.leaveTheQueue();

        queue.printQueue();

        System.out.println("A fila está vazia? " + queue.isEmpty());
    }

    @Override
    public void executeTestTwo() {
        queue.first();
    }

    @Override
    public void executeTestThree() {
        queue.leaveTheQueue();
    }
}
