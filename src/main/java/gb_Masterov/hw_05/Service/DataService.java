package gb_Masterov.hw_05.Service;

import gb_Masterov.hw_05.Data.Student;
import gb_Masterov.hw_05.Data.Teacher;
import gb_Masterov.hw_05.Data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public List<User> getAllUser(){
        return userList;
    }

    public void create(String firstName, String secondName, String lastName, Type type){
        User user = null;
        int currId = getFreeId(type);
        if (Type.STUDENT==type){
            user = new Student(firstName, secondName, lastName, currId);
        }
        else if (Type.TEACHER==type){
            user = new Teacher(firstName, secondName, lastName, currId);
        }
        userList.add(user);
    }

    private int getFreeId(Type type){
        int lastId =0;
        boolean isStudent = Type.STUDENT==type;  // спросить у Кирилла про возможность поместить переменную, отвечающую за сравниваемый тип в instanceof
            for (User user: userList){
                if (user instanceof Teacher && !isStudent)
                    lastId = ((Teacher) user).getTeacherId();
                else if (user instanceof Student && isStudent)
                    lastId = ((Student) user).getStudentId();
            }
        return lastId +1;
    }

    public List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Student)
                studentList.add((Student) user);
        }
        return studentList;
    }

    public List<Teacher> getAllTeachers(){
        List<Teacher> teacherList = new ArrayList<>();
        for (User user: userList){
            if (user instanceof Teacher)
                teacherList.add((Teacher) user);
        }
        return teacherList;
    }

}
