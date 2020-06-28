package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.abstractfactory;

public class YellowThemeWidgetFactory implements WidgetFactory {
    @Override
    public Scrollbar createScrollbar() {
        return new YellowThemeScrollbar();
    }

    @Override
    public Window createWindow() {
        return new YellowThemeWindow();
    }
}
