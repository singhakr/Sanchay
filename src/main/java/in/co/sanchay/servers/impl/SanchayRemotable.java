/*
 * SanchayActivable.java
 *
 * Created on November 3, 2005, 10:19 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.servers.impl;

import java.io.*;
import java.rmi.*;
//import java.rmi.activation.*;

import in.co.sanchay.GlobalProperties;
import in.co.sanchay.servers.SanchayServerRI;
import in.co.sanchay.properties.PropertiesManager;

/**
 *
 *  @author Anil Kumar Singh
 */
//public abstract class SanchayActivable
//public abstract class SanchayRemotable extends RemoteServer
public abstract class SanchayRemotable
    implements SanchayServerRI, Serializable {

    protected final PropertiesManager propman;
    
    protected SanchayRemotable(String propManPath, String cs) throws RemoteException, IOException {
        super();
        
        File propManFile = new File(propManPath);
        
        if(propManFile.exists())       
            propman = new PropertiesManager(propManPath, cs);
        else
            propman = null;
    }    
	
    public PropertiesManager getPropertiesManager() throws RemoteException
    {
        return propman;
    }
    
    public String checkConnection()
    {
        return GlobalProperties.getIntlString("Connected_successfully");
    }
}
