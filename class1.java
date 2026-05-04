class Ipl{
    int teams=10;
    int players=11;
    int slaray=10;
}
void details(){
    System.out.println("Total Teams in the Ipl : "+teams);
    System.out.println("Total Players in per team : "+players);
    System.out.println("Salary for each player :"+players*salary);
}


public class class1{
    public static void main(String[] args){

        Ipl ipl=new Ipl();
        ipl.details();
    }
}