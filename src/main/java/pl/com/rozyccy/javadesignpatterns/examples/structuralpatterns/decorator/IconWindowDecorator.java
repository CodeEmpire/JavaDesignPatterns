package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IconWindowDecorator extends WindowDecorator {

    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        log.info("Draw icon");
        window.draw();
    }
}
