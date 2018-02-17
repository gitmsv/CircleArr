package ua.jvlab.smlnk;

import ua.jvlab.smlnk.objects.Circle;

public class Main {

    public static void main(String[] args) {

        // "Output: -> CONST Circle...)"
        System.out.println(Circle.NAME + "\n");

        // build Circle_1;
        Circle cr1 = new Circle();
        System.out.println("radius: Circle_1 = " + cr1.getR());
        System.out.println("arr: Circle_1 = " + cr1.getArea() + "\n");

        // build Circle_2;
        Circle cr2 = new Circle(20.0);
        System.out.println("radius: Circle_2 = " + cr2.getR());
        System.out.println("arr: Circle_2 = " + cr2.getArea() + "\n");

        // input param;
        cr1.setR(7.0);
        cr2.setR(10.0);

        /* comb -> build Circle_3 */
        Circle cr3 = Circle.comb(cr1, cr2);

        /*output console */
        System.out.println("radius: Circle_3 combines = " + cr1.getR() + " + " + cr2.getR());
        System.out.println("arr: Circle_3 = " + cr3.getArea() + "\n");

    }
}
