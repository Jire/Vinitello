package com.vinitello.world.pf.base;

import com.vinitello.world.Position;
import com.vinitello.world.pf.WorldPath;
import com.vinitello.world.pf.WorldPathFinder;

abstract class BaseWorldPathFinder implements WorldPathFinder {

	@Override
	public WorldPath findPath(Position start, Position finish) {
		return null;
	}

}