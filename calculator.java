class calculator1{
    int n1,n2,res,res1,res2;
    void cal(int x, int y){
        n1=x;
        n2=y;
        res = n1*n2;
        res1 = n1+n2;
        res2 = n1-n2;
        System.out.println("The addition value is :"+res1);
        System.out.println("The Multiplication value is :"+res);
        System.out.println("The Subtraction value is :"+res2);
    }
}

public class calculator{
    public static void main(String[] args){
        calculator1 c = new calculator1();
        c.cal(10,5);

    }
}