package gb_Masterov.hw_05.View;

import gb_Masterov.hw_05.Data.StudyGroup;
import gb_Masterov.hw_05.Data.Student;

public class StudGroupView {
    public void printOnConsole(StudyGroup studyGroup){
        System.out.println("Группа №"+ studyGroup.getGroupNumber());
        System.out.println(studyGroup.getTeacher());
        for (Student student: studyGroup.getStudentList())
            System.out.println(student);
        System.out.println();
    }
}
