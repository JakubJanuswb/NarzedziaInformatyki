public class Student {

    private String name;
    private String kraj;
    private String address;
    private int id;
    private int kod;

    public Student(String name, String address, String kraj, int id, int kod) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.kraj = kraj;
        this.kod = kod;
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

    public void setKod(int kod) {
        this.kod = kod;
    }

    public void setKod(int Kod) {
        this.kod = kod;
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

    public int getKod() {
        return kod;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id + '\'' +
                ", kraj=" + kraj + '\'' +
                ", kod=" + kod
                '}';
    }
}
