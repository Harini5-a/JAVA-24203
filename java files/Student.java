public class Student {
    public String Name;
    private String ID;
    private char section;
    public void read() {
        System.out.println("Student Reading");
    }
    private void Dance() {
        System.out.println("Student Dancing");
    }
    protected void Fight() {
        System.out.println("Student Fighting");
    }
    public static void main(String args[]) {
        Student Ram = new Student();
        Ram.Name = "Ram";
        Ram.ID = "24203";
        Ram.section = 'C';
        Ram.read();
        Ram.Dance();
        Ram.Fight();
        System.out.println("Name:" +Ram.Name, "section:" +Ram.section);
        Student Hari = new Student();
        Hari.Name = "Hari";
        Hari.ID = "24202";
        Hari.section = 'C';
        Hari.read();
        Hari.Dance();
        Hari.Fight();
        System.out.println("name:" +Hari.Name, "id" + Hari.ID, "section:" +Hari.section);
        Student Krish = new Student();
        Krish.Name = "Krish";
        Krish.ID = "24201";
        Krish.section = 'C';
        Krish.read();
        Krish.Dance();
        Krish.Fight();
        System.out.println("name:"+Krish.Name, "id: " +Krish.ID, "section:" +Krish.section);

    }
}
