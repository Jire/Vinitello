package com.vinitello.engine.base;

import com.vinitello.engine.Task;

public abstract class BaseTask implements Task {

	private boolean running = true;

	public void stop() {
		if (!isRunning()) {
			throw new IllegalStateException("Task is already stopped!");
		}
		running = false;
	}

	public boolean isRunning() {
		return running;
	}

	protected abstract void execute();

	@Override
	public boolean run() {
		execute();
		return isRunning();
	}

}