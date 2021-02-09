import java.rmi.Naming;
import java.util.logging.Logger;

public class Client {

    static Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        try {
            Worker worker = (Worker) Naming.lookup("//localhost/Worker");

            // Adicionar chamadas de métodos de Worker abaixo
            // Exemplo:
            String palavra = "ovo";
            Boolean isPalindrome = worker.isPalindrome(palavra);
            logger.info( getFrase(palavra, isPalindrome) );
        } catch (Exception var2) {
            logger.warning("Error: " + var2.getMessage());
            var2.printStackTrace();
        }
    }

    private static String getFrase(String palavra, Boolean isPalindrome) {
        return Boolean.TRUE.equals(isPalindrome) ? palavra + " é palíndrome" : palavra + " não é palíndrome";
    }

}
