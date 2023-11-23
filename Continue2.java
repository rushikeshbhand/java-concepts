public class Continue2 {
    public static void main(String[] args) {
        int num = 1;
        
        while (num <= 10) {
            if (num == 5 || num == 8) {
                num++;
                continue;  // Skips the current iteration and continues to the next
            }
            
            System.out.println(num);
            num++;
        }
    }
}
