public class Main {
    public static void main(String args[]) {
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        graphic.add(ellipse1);
        graphic.add(ellipse2);
        graphic.add(ellipse3);
        graphic.add(ellipse4);
        graphic.print();
    }
}
