package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        Image image = new Image();
        image.setUrl("http://test.com");

        GraphicTool tool = new GraphicTool(image);

        Graphic graphic = tool.createGraphic();
        log.info("Graphic instance {}", graphic.getClass());
        log.info(graphic.getUrl());

        image.setUrl("test");
        graphic = tool.createGraphic();
        log.info(graphic.getUrl());

        Video video = new Video();
        video.setUrl("http://test.com");
        tool.setPrototype(video);

        graphic = tool.createGraphic();
        log.info("Graphic instance {}", graphic.getClass());
        log.info(graphic.getUrl());
    }

}
