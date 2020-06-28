package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.bridge;

import lombok.Data;

@Data
public class Window {

    private WindowImpl window;

    void draw(int x, int y, int width, int height, String colour) {
        window.draw(x, y, width, height, colour);
    }
}
