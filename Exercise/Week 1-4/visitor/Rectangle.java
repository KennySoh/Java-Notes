package visitor;

public class Rectangle implements Visitable {
    private double  h;
    private double w;
    public Rectangle(double h,double w) {
        this.h=h;
        this.w=w;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
