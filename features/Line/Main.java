
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
	
	private JButton lineButton;

	private static final String lineText = "    Linha    ";

	// *** Initialization of atomic elements
	public void initAtoms() {

		lineButton = new JButton(lineText);
		original();
	
	}

	/** Initializes the content pane */
	public void initContentPane() {

		toolPanel.add(lineButton);
		original();

	}

	public void initListeners() {

		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
		
		original();
	}

}
