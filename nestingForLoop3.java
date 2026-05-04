public class nestingForLoop3{
    public static void main(String[] args){

        int i,j;
        int n=4;
        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
            if((j==0) || (j==1 && i>0) || (j==2 && i>1) || (j==3 && i>2) || (i==4 && j>0)){
                System.out.print("* ");

            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
            
        }

    }
}