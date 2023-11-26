package com.lecubearoulettes.exception;

public class EventException extends RuntimeException{
    public EventException() {
    }

    public EventException(String message) {
        super(message);
    }
}
