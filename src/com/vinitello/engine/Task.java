package com.vinitello.engine;

import com.google.inject.ImplementedBy;
import com.vinitello.engine.base.BaseTask;

@ImplementedBy(BaseTask.class)
public interface Task {

	public boolean run();

}