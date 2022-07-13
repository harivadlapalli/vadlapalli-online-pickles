package com.vadlapalli.onlinepickles.response;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.vadlapalli.onlinepickles.utils.CommonUtils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDTO {
	@NotBlank(message = "User name is mandatory")
    @Size(min = 1, max = 40, message = "User name must be between 1 to 40 characters")
    @Pattern(regexp = CommonUtils.ALPHA_ONLY_PATTERN_2, message = "user name must contain alphabets characters only")
	private String userName;
	
	@NotBlank(message = "password is mandatory")
	private String password;
	
	 @NotBlank(message = "Email is mandatory")
	 @Email(message = "Invalid email")
	private String email;
}
