/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.context.impl;

/**
 *
 * @author anil
 */
public interface SimpleContext<K, E, CE extends ContextElement<E>> extends Context<K,E, CE> {

    long countContextElementTypes();
    
    CE getContextElement(K key);

    long addContextElement(K key, CE ce);

    CE removeContextElement(K key);

}
