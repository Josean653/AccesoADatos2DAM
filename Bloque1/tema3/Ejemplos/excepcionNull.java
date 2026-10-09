public class excepcionNull {
    public static void main(String[] args) {
        try {
            String texto = null;
            int longitud = texto.length();
    
            System.out.println(longitud);
        } catch (NullPointerException e) {
            System.out.println("Error | "+e.getMessage());
            e.printStackTrace();
        }
    }
}
