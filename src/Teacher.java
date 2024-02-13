package Final.src;

public abstract class Teacher {
     protected String name;
    protected double baseSalary;


    public Teacher(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    protected double calculateSalary(){

        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
