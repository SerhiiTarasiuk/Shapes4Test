abstract class BaseShape {

    protected double area;
    protected String color;

    public abstract void printMe();

    public double getArea() {
        return area;
    }

    public String getColour() {
        return color;
    }
}

