public class Numberchecker {
    public void checkNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("Even number is: " + number);
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }
    public static void main(String[] args) {
        Numberchecker checker = new Numberchecker();
        int testNumber = 4;

        try {
            checker.checkNumber(testNumber);
        } catch (EvenNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Kasi Harini");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24203");
    }
}

