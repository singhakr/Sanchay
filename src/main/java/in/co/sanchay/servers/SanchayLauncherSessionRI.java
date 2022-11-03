/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package in.co.sanchay.servers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;
import in.co.sanchay.servers.impl.SanchayMainServer;
import in.co.sanchay.servers.impl.SessionException;

/**
 *
 * @author User
 */
public interface SanchayLauncherSessionRI extends Remote {

    public SanchayMainServer getSanchayMainServerInstance(UUID sessionId) throws SessionException, RemoteException;

    public void logout(UUID sessionId) throws RemoteException;    
    
}
