package gb_Masterov.hw_05.Data;

import java.util.Objects;

public class Student extends User{

    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return this.studentId == that.studentId &&
                this.getFirstName().equals(that.getFirstName()) &&
                this.getSecondName().equals(that.getSecondName()) &&
                this.getLastName().equals(that.getLastName());
    }

    @Override
    public int hashCode() {
        int result1 = this.getFirstName() == null ? 0 : this.getFirstName().hashCode();
        int result2 = this.getSecondName() == null ? 0 : this.getSecondName().hashCode();
        int result3 = this.getLastName() == null ? 0 : this.getLastName().hashCode();
        return 29*result1+result2+result3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
