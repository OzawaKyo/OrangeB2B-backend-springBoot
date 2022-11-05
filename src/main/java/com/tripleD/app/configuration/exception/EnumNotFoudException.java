package com.tripleD.app.configuration.exception;

import org.springframework.http.converter.HttpMessageNotReadableException;

import java.util.NoSuchElementException;

public class EnumNotFoudException extends HttpMessageNotReadableException {
    private static final long serialVersionUID = 1L;
    private final String name;

    public EnumNotFoudException(String name) {
        super("Element : "+ name + " Doesnt match with enum format");
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
