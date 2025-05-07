public class utest {
    public static void main(String[] args) {
        University uni = new University("Amrita Vishwa Vidyapeetham");
        University.Department dept = uni.new Department("CSE", "CSE101");
        University.Student student = uni.new Student("Kasi Harini", "AV.SC.U4CSE24203");
        dept.displayDepartmentDetails();
        student.displayStudentDetails();
        System.out.println("Kasi Harini");
        System.out.println("CSE-C");
        System.out.println("AV.SC.U4CSE24203");
    }
}
