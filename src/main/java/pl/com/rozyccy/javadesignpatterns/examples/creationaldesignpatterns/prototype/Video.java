package pl.com.rozyccy.javadesignpatterns.examples.creationaldesignpatterns.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Video extends Graphic {
    private String url;

    @Override
    public Graphic clone() {
        Video clone = new Video();
        clone.setUrl(this.url);
        return clone;
    }
}
