package com.infosupport.minor.springboothateoasexample.exception;

import lombok.Getter;

@Getter
public class CustomerNotFoundException extends RuntimeException {
    private final Long id;

    public CustomerNotFoundException(Long id) {
        super("customer-not-found-" + id);
        this.id = id;
    }
}
