package org.jbguilib.draw;

import org.jbguilib.color.ColorRGBA;
import org.jbguilib.positioning.PercentDimension;
import org.jbguilib.positioning.PercentPoint;
import org.jbguilib.positioning.PixelDimension;
import org.jbguilib.positioning.PixelPoint;
import org.jbguilib.util.Util;
import org.lwjgl.opengl.GL11;

public class Quad {
  
  public static void drawQuad(PercentDimension dim, ColorRGBA color) {
    GL11.glBegin(GL11.GL_QUADS);
      GL11.glColor4f(color.getRed1f(), color.getGreen1f(), color.getBlue1f(), color.getAlpha());
      GL11.glVertex2f(-dim.getWidth(), -dim.getHeight());
      GL11.glVertex2f(dim.getWidth(), -dim.getHeight());
      GL11.glVertex2f(dim.getWidth(), dim.getHeight());
      GL11.glVertex2f(-dim.getWidth(), dim.getHeight());
    GL11.glEnd();
  }

  public static void drawQuad(PixelDimension dim, ColorRGBA color, PixelDimension window) {
    drawQuad(Util.pixelToPercentDimension(window, dim), color);
  }

  public static void drawQuad(PercentPoint topLeft, PercentPoint topRight, PercentPoint bottomRight, PercentPoint bottomLeft, ColorRGBA color) {
    GL11.glBegin(GL11.GL_QUADS);
      GL11.glColor4f(color.getRed1f(), color.getGreen1f(), color.getBlue1f(), color.getAlpha());
      GL11.glVertex2f(-topLeft.getX(), -topLeft.getY());
      GL11.glVertex2f(topLeft.getX(), -topLeft.getY());
      GL11.glVertex2f(topLeft.getX(), topLeft.getY());
      GL11.glVertex2f(-topLeft.getX(), topLeft.getY());
    GL11.glEnd();
  }

  public static void drawQuad(PixelPoint topLeft, PixelPoint topRight, PixelPoint bottomRight, PixelPoint bottomLeft, ColorRGBA color, PixelDimension window) {
    drawQuad(
      Util.pixelToPercentPoint(window, topLeft),
      Util.pixelToPercentPoint(window, topRight),
      Util.pixelToPercentPoint(window, bottomRight),
      Util.pixelToPercentPoint(window, bottomLeft),
      color
    );
  }

}
