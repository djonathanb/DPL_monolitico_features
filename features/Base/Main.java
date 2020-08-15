
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

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	protected JPanel toolPanel = new JPanel();
	protected Canvas canvas = new Canvas();
	private Container contentPane;
	// TODO Wipe
	private JButton wipeButton;
	// TODO Wipe
	private static final String wipeText = "   Limpar   ";
	
	// *** Initialization of atomic elements
	public void initAtoms() {
		// TODO Wipe
		wipeButton = new JButton(wipeText);
	}

	// Layout components declaration

	/** Initializes layout . No need to change */
	public void initLayout() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
	}

	/** Initializes the content pane */
	public void initContentPane() {
		// TODO Wipe
		toolPanel.add(wipeButton);
		contentPane.add(toolPanel, BorderLayout.WEST);
		contentPane.add(canvas, BorderLayout.CENTER);
	}

	public void initListeners() {

		// TODO Wipe
		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
	}

	// Initializes entire containment hierarchy
	public void init() {
		initAtoms();
		initLayout();
		initContentPane();
		initListeners();
	}

	/* Constructor. No need to modify */
	// TODO Extract features
	public Main(String appTitle) {
		super(appTitle);
		init();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
		setSize(WIDTH, HEIGHT);
		setResizable(true);
		validate();
	}

	/** main method */
	public static void main(String[] args) {
		new Main("Draw Product Line");
	}

}
