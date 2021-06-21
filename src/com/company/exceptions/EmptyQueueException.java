package com.company.exceptions;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String error) {
        super(error);
    }
}
