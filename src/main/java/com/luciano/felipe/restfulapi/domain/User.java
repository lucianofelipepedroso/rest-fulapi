package com.luciano.felipe.restfulapi.domain;

import java.util.ArrayList;
import java.util.List;

import com.luciano.felipe.restfulapi.domain.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User  {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private Role role;
	private List<Request> requests = new ArrayList<>();
	private List<RequestStage> stages = new ArrayList<>();

}
