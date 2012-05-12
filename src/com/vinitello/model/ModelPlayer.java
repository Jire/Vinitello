package com.vinitello.model;

import com.google.inject.ImplementedBy;
import com.vinitello.model.base.BaseModelPlayer;

@ImplementedBy(BaseModelPlayer.class)
public interface ModelPlayer extends ModelEntity {

}