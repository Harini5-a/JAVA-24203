public class Shapetest {
    public static void main(String[]args) {
        System.out.println("Kasi Harini");
        System.out.println("AV.SC.U4CSE24203");
        System.out.println("CSE-C");
        sphere s = new sphere(5.0);
        System.out.println("Volume of the given sphere: " + s.calculatevolume());
        System.out.println("Surface Area of the given sphere: " + s.calculatesurfacearea());
        cube c = new cube(6.0);
        System.out.println("Volume of the given cube: " + c.calculatevolume());
        System.out.println("Surface Area of the give cube: " + c.calculatesurfacearea());
    }
}
