package com.info.exception;

public class IdProofNotFoundException extends RuntimeException {

    public IdProofNotFoundException() {
        super();
    }

    public IdProofNotFoundException(String message) {
        super(message);
    }

    public IdProofNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

