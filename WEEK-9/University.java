public class University {
    String universityname;
    public University(String universityname) {
        this.universityname = universityname;
    }
    class Department {
        String deptname;
        String deptcode;
        public Department(String deptname, String deptcode) {
            this.deptname = deptname;
            this.deptcode = deptcode;
        }
        public void displayDepartmentetails() {
            System.out.println("University: " + universityname);
            System.out.println("Department Name: " + deptname);
            System.out.println("Department Code: " + deptcode);
        }
    }
    class Student {
        String studentname;
        String rollNo;
        public Student(String name, String roll) {
            this.studentname = name;
            this.rollNo = roll;
        }
        public void displayStudentDetails() {
            System.out.println("University: " + universityname);
            System.out.println("Student Name: " + studentname);
            System.out.println("Roll Number: " + rollNo);
        }
    }
}

