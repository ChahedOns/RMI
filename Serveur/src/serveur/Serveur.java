/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.net.MalformedURLException;
import java.rmi.* ;
import java.rmi.server.*; 
public class Serveur {

   
    public static void main(String[] args) throws RemoteException {
        
        try {
            
            CompteBancaire C = new CompteBancaire() ;
            java.rmi.registry.LocateRegistry.createRegistry(8585);
            Naming.rebind("rmi://127.0.0.1:8585/Myaccount",C) ; 
        }
        catch (MalformedURLException | RemoteException e )
                {
                    System.out.println("Liaison erroné! " + e.toString()) ; 
                }
    }
    
}
