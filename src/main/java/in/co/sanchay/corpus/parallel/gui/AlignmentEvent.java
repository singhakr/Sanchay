/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package in.co.sanchay.corpus.parallel.gui;

import in.co.sanchay.gui.common.SanchayEvent;

/**
 *
 * @author anil
 */
public class AlignmentEvent extends SanchayEvent {

    public static final int ALIGNMENT_CHANGED_EVENT = 0;


    /** Creates a new instance of TreeViewerEvent */
    public AlignmentEvent(Object source, int id) {
        super(source, id);
    }
}
