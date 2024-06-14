package org.jbguilib.util;

import org.jbguilib.positioning.PercentDimension;
import org.jbguilib.positioning.PercentPoint;
import org.jbguilib.positioning.PixelDimension;
import org.jbguilib.positioning.PixelPoint;

public class Util {

  public static int booleanToInt(boolean bool) {
    return !bool ? 1 : 0;
  }

  public static PercentPoint pixelToPercentPoint(PixelDimension window, PixelPoint pixel) {
    return new PercentPoint((float)window.getWidth() / pixel.getX(), (float)window.getHeight() / pixel.getY());
  }

  public static PercentDimension pixelToPercentDimension(PixelDimension window, PixelDimension dim) {
    return new PercentDimension(
      (float)window.getWidth() / dim.getWidth(),
      (float)window.getHeight() / dim.getHeight()
    );
  }
}
