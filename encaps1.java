class Student{
    private int id;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class encaps1 {
    public static void main (String[] args){
        Student stu = new Student();
        stu.setId(12);
        stu.setName("Rakesh");
        int i = stu.getId();
        String n = stu.getName();
        System.out.println(n+" id number is  "+i);
        System.out.println("________________________________________________________");
        Student stu1 = new Student();
        stu1.setId(11);
        stu1.setName("Rohan");
        int i1 = stu1.getId();
        String n1 = stu1.getName();
        System.out.println(n1+" id number is  "+i1);
    }
}
