package com.company;

import com.company.exceptions.EmptyQueueException;
import com.company.resources.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        try {
            queue.getInLine(1);
            queue.getInLine(2);

            queue.printQueue();

            queue.getInLine(3);
            queue.getInLine(4);

            queue.printQueue();

            queue.leaveTheQueue();

            queue.printQueue();

            queue.getInLine(5);

            queue.printQueue();

            queue.getInLine(6);

            queue.printQueue();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }
    }
}
