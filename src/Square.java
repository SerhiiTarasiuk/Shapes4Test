class Square extends BaseShape {
    private double lenghtA;

    public Square(double lenghtA, String color) {
        this.lenghtA = lenghtA;
        this.area = lenghtA * lenghtA;
        this.color = color;
    }

    @Override
    public void printMe() {
        System.out.println("Фігура: квадрат, площа: " + area +
                " кв.од., довжина сторони: " + lenghtA +
                " од., колір: " + color + ".");
    }

    public double getLengthA() {
        return lenghtA;
    }
}