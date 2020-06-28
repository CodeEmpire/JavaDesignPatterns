package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScrollbarWindowDecorator extends WindowDecorator {

    public ScrollbarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        log.info("Draw scrollbar");
        window.draw();
    }
}
