package visitor;

public interface Visitor {
    public double visit( Circle circleobject);
    public double visit( Square squareobject);
    public double visit( Rectangle rectobject);

}
