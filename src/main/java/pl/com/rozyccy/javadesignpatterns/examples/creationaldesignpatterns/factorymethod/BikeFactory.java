package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.factorymethod;

public class BikeFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Bike();
    }
}
