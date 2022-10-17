package com.tomaszocode;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
