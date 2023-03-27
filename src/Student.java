public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student (String name ,String adress ,String program, int year, double fee){
        super(name,adress);
        this.program = program;
        this.fee = fee;
        this.year = year;

    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" + 
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}
