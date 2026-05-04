public class nestingForLoop1{
    public static void main(String[] args){
        int i,j;
        int n=4;

        for(i=0;i<=n;i++){
            for(j=0;j<=n;j++){
                if(i==0|| j==n/2 ){
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