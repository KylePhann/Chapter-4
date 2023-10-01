package Exercise3;

public class TriangleTester {
    public static void main(String[] args) {

       // Triangle triangle1 = new Triangle(1.0,2.0,3.0);
        //Triangle triangle2 = new Triangle(5.0,6.0,7.0);

        try {
            Triangle triangle1 = new Triangle(4.0, 2.0, 3.0);
            if (triangle1.checkSides()) {
                System.out.println("Triangle 1 is a triangle. ");
            }


            Triangle triangle2 = new Triangle(1.0, 6.0, 7.0);
                if(triangle2.checkSides()) {
                    System.out.println("Triangle 2 is a triangle. ");
                }

        }catch(IllegalTriangleSideException im) {
            System.out.println("oops. " + im.getMessage());
        }
    }
}
