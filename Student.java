public class Student {

    private String name;
    private String kraj;
    private String address;
    private int id;

    public Student(String name, String address, String kraj, int id) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.kraj = kraj;
    }

    public Student() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getKraj() {
        return kraj;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id + '\'' +
                ", kraj=" + kraj +
                '}';
    }
}
