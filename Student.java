public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * khoi tao 5 tham so.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * geter.
     */
    public String getProgram() {
        return program;
    }

    /**
     * seter.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * geter2.
     */
    public int getYear() {
        return year;
    }

    /**
     * set year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * getfee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * luoi v.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * in ra tt.
     */
    @Override
    public String toString() {
        String s = "Student[" + super.toString() + ",program=";
        s += program + ",year=" + year + ",fee=" + fee + ']';
        return s;
    }
}
