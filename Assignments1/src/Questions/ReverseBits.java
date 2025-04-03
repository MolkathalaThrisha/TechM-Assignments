package Questions;
public class ReverseBits {
    public static int reverseBits(int num) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (num & 1);
            num >>= 1; 
        }
        return result;
    }
    
    public static void main(String[] args) {
        int num = 13; // Example number (00000000000000000000000000001101 in binary)
        int reversedNum = reverseBits(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Bits Number: " + reversedNum);
    }
}
