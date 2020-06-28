package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<>();

    @Override
    public void draw() {
        for (Graphic graphic:graphics) {
            graphic.draw();
        }

    }
}
