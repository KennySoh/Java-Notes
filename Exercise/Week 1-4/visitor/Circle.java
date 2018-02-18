package visitor;

public class Circle implements Visitable {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public double getRadius(){return radius;}
}
