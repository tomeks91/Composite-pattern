import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic{
    List<Graphic> graphics = new ArrayList<>();

    @Override
    public void print() {
        for(Graphic graphic: graphics){
            graphic.print();
        }
    }

    public void add(Ellipse ellipse) {
        graphics.add(ellipse);
    }
}
