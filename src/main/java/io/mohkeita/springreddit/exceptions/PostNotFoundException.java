package io.mohkeita.springreddit.exceptions;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String message) {
        super(message);
    }

}
