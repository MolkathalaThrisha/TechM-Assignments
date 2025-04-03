package Questions;
public class TypePromotionDemo {
    public static void main(String[] args) {
        int intVal = 10;
        float floatVal = 5.5f;
        double doubleVal = 20.99;
        char charVal = 'A'; 
        double result = intVal + floatVal * doubleVal / charVal;
        System.out.println("Result of mixed type expression: " + result);
    }
}
