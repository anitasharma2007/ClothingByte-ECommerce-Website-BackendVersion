package com.ecommerce.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CustomerDto {
	
	private Long id;
	@NotBlank(message = "Name is required")
	private String name;
	@NotBlank(message = "City is required")
	private String city;
	@Email(message = "Invalid Email")
	private String email;
	@NotBlank(message = "Password is required")
	private String pwd;
	@NotBlank(message = "Phone No is required")
	@Pattern(regexp="(^$|[0-9]{10})")
	private String phone;
	@NotBlank(message = "Gender is required")
	private String gender;
	@JsonProperty(access = Access.WRITE_ONLY)
	private LocalDateTime createdTimestamp;
}
