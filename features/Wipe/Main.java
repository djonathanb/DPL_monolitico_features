
/**
 * DPL Main.java
 * @author Roberto E. Lopez-Herrejon
 * Main class of Draw Product Line
 * SEP SPL Course July 2010
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")

public class Main extends JFrame {

	private JButton wipeButton;

	private static final String wipeText = "   Limpar   ";
	
	// *** Initialization of atomic elements
	public void initAtoms() {
		wipeButton = new JButton(wipeText);
		original();
	}

	/** Initializes the content pane */
	public void initContentPane() {
		toolPanel.add(wipeButton);
		original();
	}

	public void initListeners() {

		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
		
		original();
	}

}
