package org.game.components.dynamics;

import org.lib.color.ColorRGBA;
import org.lib.component.DynamicComponent;
import org.lib.draw.Quad;
import org.lib.listener.KeyListener;
import org.lib.positioning.PercentDimension;
import org.lib.positioning.PercentPoint;
import org.lib.positioning.PixelDimension;
import org.lwjgl.glfw.GLFW;

public class Bird extends DynamicComponent {
  private boolean previousButtonState = false;
  private final float JUMP_HEIGHT = 0.1f;

  public Bird() {
    this.setDimensions(new PixelDimension(50, 50));
    this.setLocation(new PercentPoint(-0.5f, 0.0f));
    this.setColor(ColorRGBA.YELLOW);
  }

  @Override
  public void applyPhysics() {
  } 

  

  public boolean isPreviousButtonState() {
    return previousButtonState;
  }

  public float getJUMP_HEIGHT() {
    return JUMP_HEIGHT;
  }

  public void setPreviousButtonState(boolean pressed) {
    this.previousButtonState = pressed;
  }

  @Override
  public void draw() {
    Quad.drawQuad(getPercentDimension(), getPercentLocation(), getColor());
  }
}
