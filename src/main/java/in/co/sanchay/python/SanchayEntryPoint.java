/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.co.sanchay.python;

import java.util.logging.Level;
import java.util.logging.Logger;

import in.co.sanchay.corpus.ssf.impl.SSFStoryImpl;
import in.co.sanchay.corpus.ssf.query.SSFQuery;
import py4j.GatewayServer;

/**
 *
 * @author anil
 */
public class SanchayEntryPoint {

    public SanchayEntryPoint() {
    }

//    public SSFStoryImpl getSSFStory() {
//        return ssfStory;
//    }
//
//    public SSFQuery getQuery()
//    {
//	return ssfQuery;
//    }

    public SSFStoryImpl createSSFStory() {
        return new SSFStoryImpl();
    }

    public SSFQuery createQuery(String qs)
    {
        SSFQuery q = new SSFQuery(qs);
        
        try {
            q.parseQuery();
        } catch (Exception ex) {
            Logger.getLogger(SanchayEntryPoint.class.getName()).log(Level.SEVERE, null, ex);
        }
        
	return q;
    }

    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new SanchayEntryPoint());
        gatewayServer.start();
        System.out.println("Gateway Server Started");
    }

}