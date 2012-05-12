package com.vinitello.world.pf.base;

import com.vinitello.world.Position;
import com.vinitello.world.pf.IWorldPath;
import com.vinitello.world.pf.IWorldPathFinder;

abstract class BaseWorldPathFinder implements IWorldPathFinder {

	@Override
	public IWorldPath findPath(Position start, Position finish) {
		return null;
	}

}