package com.company;

import com.company.exceptions.EmptyQueueException;
import com.company.resources.Queue;
import com.company.tests.QueueTest;

public class Main {

    public static void main(String[] args) {
        QueueTest queueTest = new QueueTest();

        try {
            queueTest.executeTestOne();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }

        try {
            queueTest.executeTestTwo();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }

        try {
            queueTest.executeTestThree();
        } catch (EmptyQueueException error) {
            System.out.println(error);
        }
    }
}
