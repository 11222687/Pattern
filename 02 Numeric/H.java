public class H {
    public static void main(String[] args) {
        int n=10;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(col==0 || col==n-1 || row==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
