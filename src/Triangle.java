class Triangle extends BaseShape {
    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
        this.color = color;
        double semiPerimeter = (lengthA + lengthB + lengthC) / 2;
        this.area = Math.sqrt(semiPerimeter * (semiPerimeter - lengthA) *
                (semiPerimeter - lengthB) * (semiPerimeter - lengthC));
    }

    @Override
    public void printMe() {
        System.out.println("Фігура: трикутник, площа: " + area + " кв.од., колір: " + color +
                ", довжина сторони A: " + lengthA +
                ", довжина сторони B: " + lengthB +
                ", довжина сторони C: " + lengthC +
                ", Трикутник прямокутній = " + isRightAngled() + " .");
    }

    public boolean isRightAngled() {
        double aSquared = Math.pow(lengthA, 2);
        double bSquared = Math.pow(lengthB, 2);
        double cSquared = Math.pow(lengthC, 2);

        return aSquared + bSquared == cSquared ||
                bSquared + cSquared == aSquared ||
                cSquared + aSquared == bSquared;
    }
}