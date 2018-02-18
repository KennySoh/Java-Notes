package visitor;

public class AreaVisitor implements Visitor {
    private double totalArea=0;
    @Override
    public double visit(Square squareobject) {
        totalArea+=squareobject.getH()*squareobject.getH();
        return squareobject.getH()*squareobject.getH();
    }

    @Override
    public double visit(Rectangle rectobject) {
        totalArea+=rectobject.getH()*rectobject.getW();
        return rectobject.getH()*rectobject.getW();
    }

    @Override
    public double visit(Circle circleobject) {
        totalArea+=Math.PI*circleobject.getRadius()*circleobject.getRadius();
        return Math.PI*circleobject.getRadius()*circleobject.getRadius();
    }

    public double getTotalArea() {
        return totalArea;
    }
}
