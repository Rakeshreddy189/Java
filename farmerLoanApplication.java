import java.util.Scanner;

class farmer{
    private float amount;
    private float tenure;
    private float simpleIntrest;

    static float rateOfIntrest;
    static {
        rateOfIntrest = 3.7f;
    }
    {
        System.out.println("Farmer please fill the form");
    }

    void input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Farmer please enter the amount you needed");
        amount = scan.nextFloat();

        System.out.println("Farmer please enter the tenure you needed");
        tenure = scan.nextFloat();
    }
    void count(){
        simpleIntrest= (amount * tenure * rateOfIntrest)/100.0f;

    }
    void display(){
        System.out.println("principal amount for farmer is :"+amount);
        System.out.println("tenure months of loan for farmer is :"+tenure);
        System.out.println("simple intreset amount for farmer is :"+simpleIntrest);
    }
}
public class farmerLoanApplication {
    public static void main(String[] args){
        farmer f1 = new farmer();
        f1.input();
        f1.count();
        f1.display();

        farmer f2 = new farmer();
        f2.input();
        f2.count();
        f2.display();
        farmer f3 = new farmer();
        f3.input();
        f3.count();
        f3.display();


    }
}
