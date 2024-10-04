public class A{
    public static void main(String[] args) {
        int n=10;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(col==0 && row>0 || row==0 && col>0 && col<(n-1)/2 || row==(n-1)/2 && col<(n-1)/2 || col==(n-1)/2 && row>0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }
}