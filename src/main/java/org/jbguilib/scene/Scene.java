package org.jbguilib.scene;

import org.jbguilib.component.StaticComponent;
import org.jbguilib.manager.SceneManager;
import org.jbguilib.component.DynamicComponent;
import java.util.*;

public abstract class Scene {
  private String sceneName;

  Set<DynamicComponent> dynamicComponent = new HashSet<>();
  Set<StaticComponent> staticComponents = new HashSet<>();

  public Scene(String sceneName) {
    this.sceneName = sceneName;
    SceneManager.getInstance().registerScene(this);
  }

  public String getName() { return this.sceneName; }

  public void applyPhysicsAndCollisions() {}
  public void applyEvents() {}
  
  public void drawFrame() {
    for(StaticComponent comp : staticComponents) {
      comp.run();
    }

    applyEvents();
    applyPhysicsAndCollisions();

    for(DynamicComponent comp : dynamicComponent) {
      comp.run();
    }
  }
}
