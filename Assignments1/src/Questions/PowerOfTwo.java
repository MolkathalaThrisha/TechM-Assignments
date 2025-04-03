package Questions;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int num) {
        return (num > 0) && ((num & (num - 1)) == 0);
    }
    
    public static void main(String[] args) {
        int num = 16; 
        
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of two.");
        } else {
            System.out.println(num + " is not a power of two.");
        }
    }
}
