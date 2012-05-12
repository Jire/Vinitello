package com.winterlove.task;

import com.google.inject.Inject;
import com.vinitello.task.cycled.CycledTaskService;

public class TaskService extends CycledTaskService {

	@Inject
	protected TaskService(String threadName, int initialTaskCapacity, int cycleLength) {
		super("Engine", 10_000, 600);
	}

}