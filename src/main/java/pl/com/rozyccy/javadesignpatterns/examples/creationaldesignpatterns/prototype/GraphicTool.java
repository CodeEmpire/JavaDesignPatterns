package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.prototype;

import lombok.Data;

@Data
public class GraphicTool {
    private Graphic prototype;

    public GraphicTool(Graphic prototype) {
        this.prototype = prototype;
    }

    protected Graphic createGraphic() {
        return prototype.clone();
    }
}
