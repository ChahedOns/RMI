

package client;
import java.rmi.*;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.util.* ; 
import serveur.Compte; 
public class Client {

    
    public static void main(String[] args) {
        try{
            Compte C = (Compte) Naming.lookup("rmi://127.0.0.1:8585/Myaccount"); 
            
            C.debiter(100.5);
            System.out.println( C.lireSolde());

            
        }
        catch(MalformedURLException | NotBoundException | RemoteException e )
        {System.out.println("Recherche Erronée" + e.toString());}
    }
    
}
