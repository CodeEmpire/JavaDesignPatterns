package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Image extends Graphic {
    private String url;

    @Override
    public Graphic clone() {
        Image clone = new Image();
        clone.setUrl(this.url);
        return clone;
    }
}
