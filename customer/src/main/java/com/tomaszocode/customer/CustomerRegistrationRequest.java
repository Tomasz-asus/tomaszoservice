package com.tomaszocode.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
