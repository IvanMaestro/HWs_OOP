package gb_Masterov.hw_05;

import gb_Masterov.hw_05.Controller.Controller;
import gb_Masterov.hw_05.Data.StudyGroup;
import gb_Masterov.hw_05.Data.Student;
import gb_Masterov.hw_05.Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        На семинаре
        Controller controller = new Controller();
        controller.createStudent("Aleksandrov","Andrey","Sergeevich");
        controller.createStudent("Filatov","Georgiy","Aleksandrovich");
        controller.printAllStudents();
        System.out.println();

        controller.createTeacher("Potapov","Uriy","Ivanovich");
        controller.createTeacher("Dmitriev","Pavel","Valerievich");

        controller.createStudent("Dovlatov","Semen","Arkadievich");
        controller.createStudent("Ponomarev","Dmitriy","Pavlovich");
        controller.printAllStudents();
        System.out.println();

//        Домашнее задание
        List<Student> allStudentList = controller.getAllStudents();

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(allStudentList.get(0));
        studentList1.add(allStudentList.get(1));

        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(allStudentList.get(2));
        studentList2.add(allStudentList.get(3));

        List<Teacher> allTeacherList = controller.getAllTeachers();

        StudyGroup studyGroup1 = controller.createStudGroup(allTeacherList.get(0), studentList1, 111);
        StudyGroup studyGroup2 = controller.createStudGroup(allTeacherList.get(1), studentList2, 222);

        controller.printStudGroup(studyGroup1);
        controller.printStudGroup(studyGroup2);

//        Изменим параметры студентов в исходных списках и выведем еще раз группы
        allStudentList.get(0).setSecondName("Nikos");
        allStudentList.get(2).setSecondName("Aleks");

        System.out.println("После изменения параметров в исходном списке: \n");
        controller.printStudGroup(studyGroup1);
        controller.printStudGroup(studyGroup2);

        // Проверим работу метода проверки наличия пользователей в группе
        controller.isUserInThisGroup(studyGroup1, studentList1.get(0));
        controller.isUserInThisGroup(studyGroup1, studentList1.get(1));
        controller.isUserInThisGroup(studyGroup2, allStudentList.get(3));
        controller.isUserInThisGroup(studyGroup1, allStudentList.get(3));
        controller.isUserInThisGroup(studyGroup2, allTeacherList.get(1));
        controller.isUserInThisGroup(studyGroup1, allTeacherList.get(1));



    }
}
