package visitor;

public class Square implements Visitable {
    private double h;
    public Square(double h) {
        this.h=h;
    }

    public double getH() {
        return h;
    }

    @Override

    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
