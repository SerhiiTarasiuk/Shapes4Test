import java.util.Random;
public class Main {
//    public static void main(String[] args) {
//        BaseShape[] набірФігур = new BaseShape[5];
//
//        набірФігур[0] = new Square(5, "синій");
//        набірФігур[1] = new Triangle(3, 5, 5, "жовтий");
//        набірФігур[2] = new Square(5, "синій");
//        набірФігур[3] = new Trapeze(3, 4, 5, "жовтий");
//        набірФігур[4] = new Circle(5,"білий");
//
//        for (BaseShape shapes : набірФігур) {
//            shapes.printMe();
//        }
//    }

    public static void main(String[] args) {
        Random random = new Random();
        int sizeArray = random.nextInt(10) + 1;

        BaseShape[] shapesArray = new BaseShape[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            int randomShape = random.nextInt(4);

            switch (randomShape) {
                case 0:
                    int lenghtA = random.nextInt(20) + 1;
                    String color = generateRandomColor();
                    shapesArray[i] = new Square(lenghtA, color);
                    break;
                case 1:
                    int radius = random.nextInt(20) + 1;
                    String color1 = generateRandomColor();
                    shapesArray[i] = new Circle(radius, color1);
                    break;
                case 2:
                    int lengthA = random.nextInt(20) + 1;
                    int lengthB = random.nextInt(20) + 1;
                    int lengthC = random.nextInt(20) + 1;
                    String color2 = generateRandomColor();
                    shapesArray[i] = new Triangle(lengthA, lengthB, lengthC, color2);
                    break;
                case 3:
                    int lenghtHighSide = random.nextInt(20) + 1;
                    int lenghtLowSide = random.nextInt(20) + 1;
                    int lenghtSide = random.nextInt(20) + 1;
                    String color3 = generateRandomColor();
                    shapesArray[i] = new Trapeze(lenghtHighSide, lenghtLowSide, lenghtSide, color3);
                    break;
            }
        }

        for (BaseShape BaseShape : shapesArray) {
            BaseShape.printMe();
        }
    }

    private static String generateRandomColor() {
        String[] colors = {"червоний", "синій", "жовтий", "зелений", "оранжевий"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
