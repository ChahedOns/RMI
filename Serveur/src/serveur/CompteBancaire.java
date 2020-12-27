
package serveur;
import java.rmi.* ; 
import java.rmi.server.*;

public class CompteBancaire extends UnicastRemoteObject implements Compte {
    
    private double solde ; 
    
    public CompteBancaire ()throws RemoteException {
    super() ; 
    }
    public CompteBancaire (double SoldeD)throws RemoteException {
    super() ; 
    this.solde= SoldeD ; 
    }

    @Override
    public void debiter(double somme) throws RemoteException {
        this.solde= this.solde + somme ; 
    }

    @Override
    public void crediter(double somme) throws RemoteException {
        this.solde= this.solde - somme ;
    }

    @Override
    public double lireSolde() throws RemoteException {
        return this.solde; 
    }
    
}
