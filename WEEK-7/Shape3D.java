abstract class Shape3D {
    public double calculatevolume();
    abstract double calculatesurfacearea();
}
class sphere extends Shape3D {
    public double r;
    public sphere(double r) {
        this.r = r;
    }
    double calculatevolume() {
        return (1.34*3.14*r*r*r);
    }
    double calculatesurfacearea() {
        return (4*3.14*r*r);
    }
}
class cube extends Shape3D {
    public double s;
    public cube(double s) {
        this.s = s;
    }
    double calculatevolume() {
        return (s*s*s);
    }
    double calculatesurfacearea() {
        return (6*s*s);
    }
}
