package model;

public class Student extends User{
    private static Integer idGenerator = 0;
    private final Integer studentId;

    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studentId = idGenerator++;
    }

    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return studentId + " " + super.toString();
    }
}
