package Problem2;

public class Demo {
    public static void main(String[] args) {
        Scalable[] scalables = new Scalable[4];
        scalables[0] = new Circle(5);
        scalables[1] = new Ellipse(7, 3);
        scalables[2] = new Triangle(3, 4, 5);
        scalables[3] = new EquilateralTriangle(6);

        printAndScale(scalables, 2);
    }

    public static void printAndScale(Scalable[] scalables, double scaleFactor) {
        System.out.println("Before scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable);
        }

        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }

        System.out.println("\nAfter scaling:");
        for (Scalable scalable : scalables) {
            System.out.println(scalable);
        }
    }
}