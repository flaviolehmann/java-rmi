import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Logger;


public class Server extends UnicastRemoteObject {

    static Logger logger = Logger.getLogger( Server.class.getName() );

    public Server() throws RemoteException {
        super();
    }

    public static void main(String[] args) {
        try {
            Worker worker = (Worker) UnicastRemoteObject.exportObject(new WorkerImpl());
            Naming.rebind("//localhost/Worker", worker);

            logger.info("Ligado no registro");
        } catch (Exception e) {
            logger.warning("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
