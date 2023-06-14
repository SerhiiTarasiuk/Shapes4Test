class Trapeze extends BaseShape
    {
        private double lenghtHighSide;
        private double lenghtLowSide;
        private double lenghtSide;

        public Trapeze(double lenghtLowSide, double lenghtHighSide, double lenghtSide, String color) {
            this.lenghtHighSide = lenghtHighSide;
            this.lenghtLowSide = lenghtLowSide;
            this.lenghtSide = lenghtSide;
            this.color = color;
        }

        @Override
        public void printMe() {
            System.out.println("Фігура: трапеція, площа: " + getArea() + " кв.од., колір: " + getColour() +
                    ", верхня основа " + getLenghtHighSide() +
                    ", нижня основа: " + getLenghtLowSide() +
                    ", бічна основа: " + getLenghtLowSide() + ".");
        }
        @Override
        public double getArea() {
            area = (lenghtLowSide + lenghtHighSide) * lenghtSide / 2;
            return area;
        }

        public double getLenghtHighSide() {return lenghtHighSide;}

        public double getLenghtLowSide() {return lenghtLowSide;}

        public double getLenghtSide() {return lenghtSide;}
    }