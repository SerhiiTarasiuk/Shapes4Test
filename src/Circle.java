class Circle extends BaseShape {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.color = color;
    }

    @Override
    public void printMe() {
        System.out.println("Фігура: коло, площа: " + area +
                " кв.од., радіус: " + radius +
                " од., колір: " + color + ".");
    }

    public double getRadius() {
        return radius;
    }
}