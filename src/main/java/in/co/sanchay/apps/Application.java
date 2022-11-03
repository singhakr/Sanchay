/*
 * Created on Sep 22, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package in.co.sanchay.apps;

import java.rmi.*;

import in.co.sanchay.properties.PropertiesManager;
import in.co.sanchay.properties.*;

/**
 *  @author Anil Kumar Singh
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface Application {

    public PropertiesManager getPropertiesManager() throws RemoteException;
    public void setPropertiesManager(PropertiesManager pm) throws RemoteException;
}
