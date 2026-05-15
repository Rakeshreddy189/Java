class car{
    private String brand;
    private double cost;

    static int count;
    {
        count++;
        //this is java init block
        //when ever we creating a new object the constructor will be called
        //when ever constructor is called,
        // before calling constructor,java init block will be executed
    }
    car(){

    }
    car(String brand, double cost){
        this.brand=brand;
        this.cost=cost;
    }
    car(String brand){
        this.brand=brand;
    }
}
public class staticLaunch {
    public static void main(String[] args){
        car c1=new car();
        car c2=new car("BMW",4900);
        car c3=new car("Audi");
        System.out.println(car.count);

    }
}
