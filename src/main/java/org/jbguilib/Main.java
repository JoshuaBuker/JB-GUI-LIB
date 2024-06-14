package org.jbguilib;

import org.jbguilib.window.Window;

public class Main {
	public static void main(String[] args) {
		Window window = new Window.Builder()
      .title("Destroyer Of Worlds!")
      .backgroundColor(74, 73, 92)
      .build();

    window.run();
  }
}