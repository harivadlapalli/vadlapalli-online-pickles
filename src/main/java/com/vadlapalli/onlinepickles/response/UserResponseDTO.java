package com.vadlapalli.onlinepickles.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {
    private String userName;
    private String password;
    private String email;
}