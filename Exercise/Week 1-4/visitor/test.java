package visitor;

import java.util.ArrayList;

public class test {
    public static void main (String[] args) {
        ArrayList<Visitable> items = new ArrayList<Visitable>();
        PerimeterVisitor peri = new PerimeterVisitor();
        AreaVisitor area= new AreaVisitor();
        items.add(new Circle(1));
        items.add(new Rectangle(1,1));
        items.add(new Square(1));
        for (Visitable o : items) {
            System.out.println("peri: "+o.accept(peri));
            System.out.println("area: "+o.accept(area));
        }

        System.out.print("This is the Tax Visitor program.\n");
        System.out.println (area.getTotalArea());
        System.out.println(peri.getTotalPeri()

        );
    }
}
