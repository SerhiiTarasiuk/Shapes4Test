class Trapeze extends BaseShape
    {
        private double lenghtHighSide;
        private double lenghtLowSide;
        private double lenghtSide;

        public Trapeze(double lenghtLowSide, double lenghtHighSide, double lenghtSide, String color) {
            this.lenghtHighSide = lenghtHighSide;
            this.lenghtLowSide = lenghtLowSide;
            this.lenghtSide = lenghtSide;
            this.area = (lenghtLowSide + lenghtHighSide) * lenghtSide / 2;
            this.color = color;
        }

        @Override
        public void printMe() {
            System.out.println("Фігура: трапеція, площа: " + area + " кв.од., колір: " + color +
                    ", верхнє основання: " + lenghtHighSide +
                    ", нижнє основання: " + lenghtLowSide +
                    ", висота: " + lenghtSide + ".");
        }

        public double getLenghtHighSide() {
            return lenghtHighSide;
        }

        public double getLenghtLowSide() {
            return lenghtLowSide;
        }

        public double getLenghtSide() {
            return lenghtSide;
        }
    }