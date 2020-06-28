package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.factorymethod;

public class CarFactory extends TransportFactory {
    @Override
    Transport create() {
        return new Car();
    }
}
