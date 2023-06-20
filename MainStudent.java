public class MainStudent {
    public static void main(String[] args) {
        System.out.println("-------------encapsulation-----------------");
        Student student = new Student();
        student.setName("Adam abacki");
        student.setAddress("Warszawa U.Piekna 3/5");
        student.setId(123);
        student.setKraj("Polska");
        student.setKod("00-012");
        System.out.println(student);
    }
}