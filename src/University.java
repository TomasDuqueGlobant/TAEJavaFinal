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

}
