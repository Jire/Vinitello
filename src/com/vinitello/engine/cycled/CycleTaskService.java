package com.vinitello.engine.cycled;

import java.util.Iterator;

import com.vinitello.engine.Task;
import com.vinitello.engine.base.BaseTaskService;

public abstract class CycleTaskService extends BaseTaskService {

	private final int cycleLength;

	protected CycleTaskService(String threadName, int initialTaskCapacity, int cycleLength) {
		super(threadName, initialTaskCapacity);
		this.cycleLength = cycleLength;
	}

	@Override
	public void run() {
		long lastCycle = 0;
		long systemTime;

		while (isRunning()) {
			systemTime = System.currentTimeMillis();
			if ((systemTime - lastCycle) > cycleLength) {
				if (getTasks().size() > 0) {
					Iterator<Task> it = getTasks().iterator();
					while (it.hasNext()) {
						if (!it.next().run())
							it.remove();
					}
				}
				long timeTaken = System.currentTimeMillis() - systemTime;
				if (timeTaken > cycleLength) {
					System.out.println("Engine overloaded by " + ((timeTaken / cycleLength) * 100) + "%");
				} else {
					try {
						sleep(cycleLength - timeTaken);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}