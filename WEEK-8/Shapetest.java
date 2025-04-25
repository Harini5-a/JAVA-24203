public class Shapetest {
    public static void main(String[]args) {
        System.out.println("Kasi Harini");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24203");
        Shape r = new rectangle(2,3);
        Shape c = new circle(4);
        Shape t = new triangle(3,4,5);
        System.out.println("Perimeter of Rectangle: " + r.getperimeter());
        System.out.println("Perimeter of Circle: " + c.getperimeter());
        System.out.println("Perimeter of Triangle: " + t.getperimeter());
    }
}
