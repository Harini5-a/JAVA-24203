abstract class patternprinter {
    abstract void printpattern(int n);
    public void displayTitle(String title) {
        System.out.println(title);
    }
}
class starpattern extends patternprinter {
    public void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
    }
}
class NumberPattern extends patternprinter {
    public void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }
}

