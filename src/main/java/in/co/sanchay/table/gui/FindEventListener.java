/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.table.gui;

import java.util.EventListener;

/**
 *
 * @author anil
 */
public interface FindEventListener extends EventListener {
    void findAndNavigate(FindEvent evt);
}
