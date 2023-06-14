class Circle extends BaseShape {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void printMe() {
        System.out.println("Фігура: коло, площа: " + getArea() +
                " кв.од., радіус: " + getRadius() +
                " од., колір: " + getColour() + ".");
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }
}