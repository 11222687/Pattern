package MY_NAME;
public class RAHUL {
    
    public static void main(String[] args) {
        int n=11;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if (col==0 || row==0 && col<(n-1)/2 || col==(n-1)/2 && row>0 && row<(n-1)/2 || row==(n-1)/2 && col<(n-1)/2 ||
                row-col == (n-1)/2) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            for(int col=0;col<n;col++){
                if(col==0 && row>0 || row==0 && col>0 && col<(n-1)/2 || row==(n-1)/2 && col<(n-1)/2 || col==(n-1)/2 && row>0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            for(int col=0;col<n;col++){
                if(col==0 || col==n-1 || row==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int col=0;col<n;col++){
                if(row==n-1 && col>0 && col<n-1 || col==0 && row<n-1|| col==n-1 && row<n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int col=0;col<n;col++){
                if (col==0 || row==n-1 ) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}


