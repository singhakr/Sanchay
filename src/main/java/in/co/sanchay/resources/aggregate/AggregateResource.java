/*
 * AggregateResource.java
 *
 * Created on November 4, 2005, 5:28 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.resources.aggregate;

import in.co.sanchay.properties.SanchayProperties;
import in.co.sanchay.resources.Resource;
import in.co.sanchay.resources.*;
import in.co.sanchay.properties.*;

/**
 *
 *  @author Anil Kumar Singh
 */
public interface AggregateResource extends Resource
{
    public SanchayProperties getProperties();
    public void setProperties(SanchayProperties tp);
}
