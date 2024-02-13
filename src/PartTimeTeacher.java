package Final.src;

public class PartTimeTeacher extends Teacher {
    protected int activeHoursPerWeek;

    public PartTimeTeacher(String name, double baseSalary, int activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    protected double calculateSalary(){
        return super.baseSalary * activeHoursPerWeek;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }
}
