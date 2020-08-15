
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

	private JButton rectButton;

	private static final String rectText = "Retângulo";
	
	// *** Initialization of atomic elements
	public void initAtoms() {
		rectButton = new JButton(rectText);
		original();
	}

	/** Initializes the content pane */
	public void initContentPane() {
		toolPanel.add(rectButton);
		original();
	}

	public void initListeners() {

		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});

		original();
	}

}
