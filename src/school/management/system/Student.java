package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid=0;
        this.feesTotal = feesTotal=3000;
    }
}
