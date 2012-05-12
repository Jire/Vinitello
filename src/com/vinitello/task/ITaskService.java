package com.vinitello.task;

import com.google.inject.ImplementedBy;
import com.vinitello.task.base.BaseTaskService;

@ImplementedBy(BaseTaskService.class)
public interface ITaskService {

	public void start();
	public void shutdown();

	public void submit(ITask task);

}