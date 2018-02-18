package visitor;

public class PerimeterVisitor implements Visitor {
    private double totalPeri=0;
    @Override
    public double visit(Square squareobject) {
        totalPeri+=squareobject.getH()*4;
        return squareobject.getH()*4;
    }

    @Override
    public double visit(Rectangle rectobject) {
        totalPeri+=rectobject.getH()*2+2*rectobject.getW();
        return rectobject.getH()*2+2*rectobject.getW();
    }

    @Override
    public double visit(Circle circleobject) {
        totalPeri+=Math.PI*circleobject.getRadius()*2;
        return Math.PI*circleobject.getRadius()*2;
    }

    public double getTotalPeri() {
        return totalPeri;
    }
}
