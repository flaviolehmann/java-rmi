import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Worker extends Remote {

    /**
     * P : verifica se S é um palíndromo
     * @param s
     * @return retorna true ou false
     */
    Boolean isPalindrome(String s) throws RemoteException;

    /**
     * I : gera uma nova string na qual os caracteres de S aparecem na ordem inversa
     * @param s
     * @return retorna a string gerada.
     */
    String reverse(String s) throws RemoteException;

    /**
     * + : gera uma nova string na qual as letras minúsculas presentes em S aparecem em maiúsculas;
     *
     * @param s
     * @return retorna a string gerada.
     */
    String toUpperCase(String s) throws RemoteException;

    /**
     * – : gera uma nova string na qual as letras maiúsculas presentes em S aparecem em minúsculas;
     * @param s
     * @return retorna a string gerada.
     */
    String toLowerCase(String s) throws RemoteException;

    /**
     * V : descobre a quantidade de vogais presentes em S
     * @param s
     * @return retorna o número inteiro obtido.
     */
    Long getVowelCount(String s) throws RemoteException;

    /**
     * C : descobre a quantidade de consoantes presentes em S
     * @param s
     * @return retorna o número inteiro obtido.
     */
    Long getConsonantCount(String s) throws RemoteException;

    /**
     * A : gera uma nova string na qual constam somente as vogais presentes em S
     * @param s
     * @return retorna a string gerada.
     */
    String getVowelsOnly(String s) throws RemoteException;

    /**
     * Z : gera uma nova string na qual constam somente as consoantes presentes em S.
     * @param s
     * @return retorna a string gerada
     */
    String getConsonantsOnly(String s) throws RemoteException;
}
