package org.jbguilib.scene;

import org.jbguilib.component.StaticComponent;
import org.jbguilib.component.DynamicComponent;
import java.util.*;

public abstract class Scene {
  Set<DynamicComponent> DynamicComponent = new HashSet<>();
  Set<StaticComponent> staticComponents = new HashSet<>();

  public void applyPhysicsAndCollisions() {}
  public void applyEvents() {}
  public void drawFrame() {}
}
