package com.book.todo.uri;

import org.springframework.stereotype.Component;

@Component
public class TaskUri {	
	
	public static final String TASKS = "/tasks";
	public static final String TASK = "/task/{id}";
	public static final String CREATE_TASK = "/task";
	
}
