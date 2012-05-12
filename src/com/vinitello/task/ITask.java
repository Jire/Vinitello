package com.vinitello.task;

import com.google.inject.ImplementedBy;
import com.vinitello.task.base.BaseTask;

@ImplementedBy(BaseTask.class)
public interface ITask {

	public boolean run();

}