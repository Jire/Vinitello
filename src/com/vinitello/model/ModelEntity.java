package com.vinitello.model;

import com.google.inject.ImplementedBy;
import com.vinitello.model.base.BaseModelEntity;
import com.vinitello.world.Position;

@ImplementedBy(BaseModelEntity.class)
public interface ModelEntity {

	public Position getPosition();

}