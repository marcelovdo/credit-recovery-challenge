package com.credit.client.exception;

public class InternalErrorException extends RuntimeException {
    public InternalErrorException(String message){
        super(message);
    }
}
