public class Person {
    private String name;
    private String address;

    /**
     * khoi tao 2 tham so.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * geter.
     */
    public String getName() {
        return name;
    }

    /**
     * seter.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter 2.
     */
    public String getAddress() {
        return address;
    }

    /**
     * seter 2.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * to String.
     */
    @Override
    public String toString() {
        return "Person[" + "name=" + name + ",address=" + address + ']';
    }
}
