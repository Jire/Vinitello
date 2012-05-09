package com.vinitello.engine;

import com.google.inject.ImplementedBy;
import com.vinitello.engine.base.BaseTaskService;

@ImplementedBy(BaseTaskService.class)
public interface TaskService {

	public void start();
	public void shutdown();

	public void submit(Task task);

}