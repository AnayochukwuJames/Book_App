package com.james.book_app.auth;

import lombok.*;


@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String token;
}
