package gb_Masterov.hw_05.Data;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private int groupNumber;
    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList, int groupNumber) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudyGroup(Teacher teacher, int groupNumber) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
        this.studentList = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
