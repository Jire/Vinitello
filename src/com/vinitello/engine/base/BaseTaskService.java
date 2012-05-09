package com.vinitello.engine.base;

import java.util.ArrayList;
import java.util.List;

import com.vinitello.engine.Task;
import com.vinitello.engine.TaskService;

public abstract class BaseTaskService extends Thread implements TaskService {

	private final List<Task> tasks;

	private boolean running;

	protected BaseTaskService(String threadName, int initialTaskCapacity) {
		super(threadName);
		this.tasks = new ArrayList<Task>(initialTaskCapacity);
	}

	protected synchronized List<Task> getTasks() {
		return tasks;
	}

	public boolean isRunning() {
		return running;
	}

	@Override
	public void submit(Task task) {
		tasks.add(task);
	}

	@Override
	public void start() {
		if (running) {
			throw new IllegalStateException("Task service has already been started");
		}
		running = true;
		super.start();
	}

	@Override
	public void shutdown() {
		if (!running) {
			throw new IllegalStateException("Task service has not been started");
		}
		running = false;
	}

}