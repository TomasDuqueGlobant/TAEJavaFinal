package Final.src;

import java.util.List;

public class University {

    public static Class searchClassByName(String className, List<Class> classes){
        for(Class classn : classes){
            if(classn.getName().equalsIgnoreCase(className)){
                return classn;
            }
        }
        return null;
    }

    public static Class searchClassById(String id, List<Class> classes){
        for(Class classn : classes){
            if(classn.getId().equalsIgnoreCase(id)){
                return classn;
            }
        }
        return null;
    }

    public static Student searchStudentById(String studentId, List <Student> students){
        for(Student student: students){
            if(student.getId().equalsIgnoreCase(studentId)){
                return student;
            }
        }
        return null;
    }

    public static Teacher searchTeacherByName(String teacherName, List<Teacher> teachers ){
        for(Teacher teacher: teachers){
            if(teacher.getName().equalsIgnoreCase(teacherName)){
            return teacher;
            }
        }
        return null;
    }

}
