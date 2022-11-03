/*
 * SanchayJDialog.java
 *
 * Created on May 20, 2006, 5:53 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package in.co.sanchay.gui.common;

import java.awt.*;
import javax.swing.*;

import in.co.sanchay.util.*;

/**
 *
 * @author Anil Kumar Singh
 */
public class SanchayJDialog extends JDialog
{
    protected JPanel panel;

    public SanchayJDialog()
    {
	super();
    }

    public SanchayJDialog(Dialog owner, String title, boolean modal)
    {
	super(owner, title, modal);
    }

    public SanchayJDialog(Dialog owner, String title, boolean modal, JPanelDialog pnl)
    {
	super(owner, title, modal);
	pnl.setDialog(this);
	panel = (JPanel) pnl;
	add(panel);
    }

    public SanchayJDialog(Frame owner, String title, boolean modal, JPanelDialog pnl)
    {
	super(owner, title, modal);
	pnl.setDialog(this);
	panel = (JPanel) pnl;
	add(panel);
    }

    public JPanel getJPanel()
    {
	return panel;
    }
};
