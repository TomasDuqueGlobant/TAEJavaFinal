package Final.src;

public class FullTimeTeacher extends Teacher{
    private int experienceYears;

    public FullTimeTeacher(String name, double baseSalary,int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }

    @Override
    protected double calculateSalary(){

        return super.baseSalary * 1.1 * experienceYears ;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
}
