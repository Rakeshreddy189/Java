class Constructor1{
    private String courseName;
    private double coursePrice;
    //A constructor in Java is a special method that is automatically called when an object is created.
    public Constructor1(String courseName,double coursePrice){
        this.courseName=courseName;
        this.coursePrice=coursePrice;
    }
    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
public class Constructor {
    public static void main(String [] args){
//invoke the constructor while creating the object
        Constructor1 co = new Constructor1("DevOps with AWS",8600);

        System.out.println(co.getCourseName());
        System.out.println(co.getCoursePrice());

    }
}
