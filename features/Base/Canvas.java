/**
 * DPL Canvas.java
 * 
 * @author Roberto E. Lopez-Herrejon
 * SEP SPL Course July 2010
 * 
 * @author Wesley K. G. Assunção
 * ERES - FeatureIDE Introduction - October 2018
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.event.*;
import javax.swing.JComponent;

import java.awt.Point;

@SuppressWarnings("serial")
public class Canvas extends JComponent implements MouseListener, MouseMotionListener {

	Point start, end;
	protected List<Shape> shapes = new LinkedList<Shape>();
	
	/** Sets up the canvas. Do not change */
	public Canvas() {
		this.setDoubleBuffered(true); // for display efficiency
		this.addMouseListener(this); // registers the mouse listener
		this.addMouseMotionListener(this); // registers the mouse motion
											// listener
	}

	/** Sets the selected figure. Do not change. */
	public void selectedFigure(FigureTypes fig) {
		figureSelected = fig;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// refreshes the canvas
		g.setColor(Color.WHITE);
		configShapeFill(g);
		
		for (Shape s : shapes) {
			s.paint(g);
		}
	}

	/** Invoked when a mouse button has been pressed on a component. */
	public void mousePressed(MouseEvent e) {
	}

	/** Invoked when a mouse button has been released on a component. */
	public void mouseReleased(MouseEvent e) {
	}

	/** Invoked when the mouse is dragged over a component */
	public void mouseDragged(MouseEvent e) {
	}

	
	// **************** Mouse Handling
	public void mouseClicked(MouseEvent e) {
	}

	// mouseClicked
	public void mouseEntered(MouseEvent e) {
	}

	/**
	 * Invoked when the mouse exits a component. Empty implementation. Do not
	 * change.
	 */
	public void mouseExited(MouseEvent e) {
	}
	
	/* Empty implementation. Do not change. */
	public void mouseMoved(MouseEvent e) {
	}

	// TODO Wipe
	public void wipe() {
		this.shapes.clear();
		this.repaint();
	}

}
