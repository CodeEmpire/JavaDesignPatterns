package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        LegacyRectangle legacyRectangle = new LegacyRectangle();

        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        client.calculateRectangleSize(adapter);

    }

    public void calculateRectangleSize(Rectangle rectangle) {
        log.info("Rectangle size: {}", rectangle.determineSize());
    }
}
