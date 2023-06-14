abstract class BaseShape {

    protected double area;
    protected String color;

    public abstract void printMe();

    public abstract double getArea();

    public String getColour() {
        return color;
    }
}

