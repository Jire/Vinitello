package com.vinitello.engine.cycled;

import com.vinitello.engine.base.BaseTask;

public abstract class CycleTask extends BaseTask {

	private final int cycleLength;
	private int countdown;

	public CycleTask(int cycleLength) {
		this.cycleLength = cycleLength;
		this.countdown = cycleLength;
	}

	@Override
	public boolean run() {
		if (countdown-- == 0) {
			countdown = cycleLength;
			return super.run();
		}
		return false;
	}

}