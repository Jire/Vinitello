package com.winterlove.task;

import com.google.inject.AbstractModule;
import com.vinitello.task.ITask;
import com.vinitello.task.ITaskService;

public class TaskModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ITask.class).to(Task.class);
		bind(ITaskService.class).to(TaskService.class);
	}

}