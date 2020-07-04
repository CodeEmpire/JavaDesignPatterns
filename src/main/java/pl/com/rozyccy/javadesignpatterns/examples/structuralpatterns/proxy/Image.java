package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Image {
    protected String url;

    public Image() {
    }

    public Image(String url) {
        log.info("Loading image");
        this.url = url;
    }

    public void draw() {
        log.info("Draw image from url " + url);
    }
}
