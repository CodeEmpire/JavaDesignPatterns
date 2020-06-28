package pl.com.rozyccy.javadesignpatterns.examples.structuralpatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Window window = new Window();
        IconWindowDecorator iconWindowDecorator = new IconWindowDecorator(window);
        ScrollbarWindowDecorator scrollbarWindowDecorator = new ScrollbarWindowDecorator(iconWindowDecorator);
        scrollbarWindowDecorator.draw();
    }
}
