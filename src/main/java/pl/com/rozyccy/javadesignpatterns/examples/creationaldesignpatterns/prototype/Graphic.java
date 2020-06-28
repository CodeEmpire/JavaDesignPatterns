package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.prototype;

public abstract class Graphic {
    public abstract Graphic clone();

    public abstract String getUrl();
}
