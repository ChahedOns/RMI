package serveur;
import java.rmi.* ; 


public interface Compte extends Remote {
    public void debiter (double somme) throws
RemoteException;
    public void crediter (double somme) throws
RemoteException;
    double lireSolde () throws
RemoteException;
     
}
