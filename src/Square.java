class Square extends BaseShape {
    private double lenghtA;

    public Square(double lenghtA, String color) {
        this.lenghtA = lenghtA;
        this.color = color;
    }

    @Override
    public void printMe() {
        System.out.println("Фігура: квадрат, площа: " + getArea() +
                " кв.од., довжина сторони: " + getLengthA() +
                " од., колір: " + getColour() + ".");
    }

    public double getLengthA() {
        return lenghtA;
    }

    public double getArea() {
        area = lenghtA * lenghtA;
        return area;
    }
}