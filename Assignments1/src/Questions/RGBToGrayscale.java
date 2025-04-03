package Questions;
public class RGBToGrayscale {
    public static int toGrayscale(int rgb) {
        int r = (rgb >> 16) & 0xFF;
        int g = (rgb >> 8) & 0xFF;  
        int b = rgb & 0xFF;        
        
        int gray = (r * 30 + g * 59 + b * 11) / 100;
        
        return (gray << 16) | (gray << 8) | gray;
    }
    
    public static void main(String[] args) {
        int rgb = 0x6495ED; 
        int grayscale = toGrayscale(rgb);
        System.out.printf("Original RGB: #%06X\n", rgb);
        System.out.printf("Grayscale RGB: #%06X\n", grayscale);
    }
}
