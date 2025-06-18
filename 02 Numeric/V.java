public class V {
    public static void main(String[] args) {
        int height = 5;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height * 2; j++) {
                if (j == i || j == (height * 2 - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}