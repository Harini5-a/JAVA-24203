public class ptest {
    public static void main(String[] args) {
        System.out.println("Kasi Harini");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24203");
        int n = 5; 
        patternprinter star = new starpattern();
        star.displayTitle("Star Pattern");
        star.printpattern(n);
        System.out.println();
        patternprinter number = new NumberPattern();
        number.displayTitle("Number Pattern");
        number.printpattern(n);
    }
}
