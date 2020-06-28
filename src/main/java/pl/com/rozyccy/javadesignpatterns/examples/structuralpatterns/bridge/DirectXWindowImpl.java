package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.bridge;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DirectXWindowImpl extends WindowImpl {

    @Override
    public void draw(int x, int y, int width, int height, String colour) {
        log.info("Drawing on directX x: {}, y: {}, width:, {}, height: {}, colour: {}", x, y, width, height, colour);
    }
}
