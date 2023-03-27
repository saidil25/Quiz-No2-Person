public class Staff extends Person{
    private String School;
    private double pay;

    public Staff(String name,String adress, String School, double pay){
        super(name,adress);
        this.pay = pay;
        this.School = School;
    }

    public String getSchool() {
        return School;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "School='" + School + '\'' +
                ", pay=" + pay +
                '}';
    }
}
