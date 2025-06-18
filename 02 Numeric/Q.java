public class Q {
    public static void main(String[] args) {
        int size = 7;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Main circle part
                if ((i == 0 || i == size-2) && (j > 0 && j < size-2) || 
                    (j == 0 || j == size-2) && (i > 0 && i < size-2) ||
                    // Tail part
                    (i == j && i >= size/2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}