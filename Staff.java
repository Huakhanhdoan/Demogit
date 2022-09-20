public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * khoi tao 4 tham so.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * khoi tao 2 tham so.
     */
    public String getSchool() {
        return school;
    }

    /**
     * doan.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * doan 2.
     */
    public double getPay() {
        return pay;
    }

    /**
     * doan3.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * doan4.
     */
    @Override
    public String toString() {
        String s = "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + ']';
        return s;
    }

    /**
     * ham main.
     */
    public static void main(String[] args) {

    }
}
