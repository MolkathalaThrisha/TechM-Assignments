package Questions;
public class IntegerCompression {
    public static byte[] encodeInteger(int num) {
        byte[] encoded = new byte[5];
        int index = 0;
        
        while ((num & ~0x7F) != 0) { 
            encoded[index++] = (byte) ((num & 0x7F) | 0x80); 
            num >>>= 7;
        }
        encoded[index++] = (byte) num;
        
        byte[] result = new byte[index];
        System.arraycopy(encoded, 0, result, 0, index);
        return result;
    }
    
    public static int decodeInteger(byte[] encoded) {
        int num = 0, shift = 0;
        
        for (byte b : encoded) {
            num |= (b & 0x7F) << shift; 
            if ((b & 0x80) == 0) break; 
            shift += 7;
        }
        return num;
    }
    
    public static void main(String[] args) {
        int number = 123456;
        byte[] encoded = encodeInteger(number);
        int decoded = decodeInteger(encoded);
        
        System.out.println("Original Number: " + number);
        System.out.print("Encoded Bytes: ");
        for (byte b : encoded) {
            System.out.printf("%02X ", b);
        }
        System.out.println("\nDecoded Number: " + decoded);
    }
}
