package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.abstractfactory;

public class PinkThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new PinkThemeScrollbar();
    }

    @Override
    public Window createWindow() {
        return new PinkThemeWindow();
    }
}
