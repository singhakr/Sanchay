/*
 * SanchayActivable.java
 *
 * Created on November 2, 2005, 7:12 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.servers.impl;

import java.io.*;
import java.rmi.*;
//import java.rmi.activation.*;
import in.co.sanchay.servers.SanchayServerRI;
import in.co.sanchay.properties.*;

/**
 *
 *  @author Anil Kumar Singh
 */
public abstract class SanchayServer extends SanchayRemotable
    implements SanchayServerRI, Serializable {

    /**
     * 
     */
    protected SanchayServer(String propManPath, String cs) throws RemoteException, IOException
    {
        super(propManPath, cs);
    }    
}
