package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.proxy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Client {

    public static void main(String[] args) {
        ImageProxy image = new ImageProxy("test iamge");
        ImageProxy image2 = new ImageProxy("second image");

        List<Image> images = new ArrayList<>();
        images.add(image);
        images.add(image2);

        Application application = new Application(images);

        log.info("Application ssetup");

        application.draw();
    }
}
