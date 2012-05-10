package com.vinitello.model.base;

import com.vinitello.model.ModelEntity;
import com.vinitello.world.Position;

public abstract class BaseModelEntity implements ModelEntity {

	private final Position position;

	protected BaseModelEntity(Position position) {
		this.position = position;
	}

	public Position getPosition() {
		return position;
	}

}