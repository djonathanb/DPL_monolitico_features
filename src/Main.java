
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

public  class  Main  extends JFrame {
	

	private static final int WIDTH = 800;

	
	private static final int HEIGHT = 600;

	

	protected JPanel toolPanel = new JPanel();

	
	protected Canvas canvas = new Canvas();

	
	private Container contentPane;

	
	
	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Base  () {
	}

	
	
	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Wipe  () {
		wipeButton = new JButton(wipeText);
		initAtoms__wrappee__Base();
	}

	
	
	// *** Initialization of atomic elements
	 private void  initAtoms__wrappee__Rect  () {
		rectButton = new JButton(rectText);
		initAtoms__wrappee__Wipe();
	}

	

	// *** Initialization of atomic elements
	public void initAtoms() {

		lineButton = new JButton(lineText);
		initAtoms__wrappee__Rect();
	
	}

	

	// Layout components declaration

	/** Initializes layout . No need to change */
	public void initLayout() {
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		toolPanel.setLayout(new BoxLayout(toolPanel, BoxLayout.Y_AXIS));
	}

	

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Base  () {
		contentPane.add(toolPanel, BorderLayout.WEST);
		contentPane.add(canvas, BorderLayout.CENTER);
	}

	

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Wipe  () {
		toolPanel.add(wipeButton);
		initContentPane__wrappee__Base();
	}

	

	/** Initializes the content pane */
	 private void  initContentPane__wrappee__Rect  () {
		toolPanel.add(rectButton);
		initContentPane__wrappee__Wipe();
	}

	

	/** Initializes the content pane */
	public void initContentPane() {

		toolPanel.add(lineButton);
		initContentPane__wrappee__Rect();

	}

	

	 private void  initListeners__wrappee__Base  () {
	}

	

	 private void  initListeners__wrappee__Wipe  () {

		wipeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.wipe();
			}
		});
		
		initListeners__wrappee__Base();
	}

	

	 private void  initListeners__wrappee__Rect  () {

		rectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.RECT);
			}
		});

		initListeners__wrappee__Wipe();
	}

	

	public void initListeners() {

		lineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvas.selectedFigure(Canvas.FigureTypes.LINE);
			}
		});
		
		initListeners__wrappee__Rect();
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

	

	private JButton wipeButton;

	

	private static final String wipeText = "   Limpar   ";

	

	private JButton rectButton;

	

	private static final String rectText = "Retângulo";

	
	
	private JButton lineButton;

	

	private static final String lineText = "    Linha    ";


}
