package com.luciano.felipe.restfulapi.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.luciano.felipe.restfulapi.domain.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private Date creationDate;
	private RequestState stage;
	private User user;
	private List<RequestStage> stages = new ArrayList<RequestStage>();

}
