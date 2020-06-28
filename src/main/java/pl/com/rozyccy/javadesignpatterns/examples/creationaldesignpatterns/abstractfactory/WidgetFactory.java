package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.abstractfactory;

public interface WidgetFactory {
    Scrollbar createScrollbar();
    Window createWindow();
}
