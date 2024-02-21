package gb_Masterov.hw_05.Data;

import java.util.Objects;

public class Teacher extends User{

    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, int teacherId) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher that = (Teacher) o;
        return this.teacherId == that.teacherId &&
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
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }
}
