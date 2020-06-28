package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    public static void main(String[] args) {
        Line line = new Line();
        Rectangle rectangle = new Rectangle();
        GraphicItemGroup group = new GraphicItemGroup();

        group.getGraphics().add(line);
        group.getGraphics().add(rectangle);

        group.draw();

        Line line1 = new Line();
        GraphicItemGroup group2 = new GraphicItemGroup();
        group2.getGraphics().add(line1);

        group2.getGraphics().add(group);

        log.info("Drawing group2");
        group2.draw();
    }
}
