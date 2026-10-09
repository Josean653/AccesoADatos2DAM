public class excepcionArithmetic {
    public static void main(String[] args) {
        try {
            int a = 2;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Error | "+e.getMessage());
            e.printStackTrace();
        }
    }
}
