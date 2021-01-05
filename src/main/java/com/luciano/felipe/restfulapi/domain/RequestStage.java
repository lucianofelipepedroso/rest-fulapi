package com.luciano.felipe.restfulapi.domain;

import java.util.Date;

import com.luciano.felipe.restfulapi.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestStage {
	
	private Long id;
	private String description;
	private Date realizationDate;
	private RequestState stage;
	private Request request;
	private User user;

}
