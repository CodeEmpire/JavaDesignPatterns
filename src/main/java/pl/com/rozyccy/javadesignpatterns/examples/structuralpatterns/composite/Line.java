package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Line implements Graphic{
    public void draw() {
        log.info("Draw a line");
    }
}
