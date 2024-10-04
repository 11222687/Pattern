public class U {
    public static void main(String[] args) {
        int n=11;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==n-1 && col>0 && col<n-1 || col==0 && row<n-1|| col==n-1 && row<n-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }System.out.println();
        }
    }
}
