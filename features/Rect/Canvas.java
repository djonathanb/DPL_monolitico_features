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
	
	private void configShapeFill(Graphics g) {
		g.fillRect(0, 0, getWidth(), getHeight());
	}
	
	/** Invoked when a mouse button has been pressed on a component. */
	public void mousePressed(MouseEvent e) {
		if (figureSelected == FigureTypes.RECT) {
			mousePressedRect(e);
		}
	}

	/** Invoked when a mouse button has been released on a component. */
	public void mouseReleased(MouseEvent e) {
		if (figureSelected == FigureTypes.RECT) {
			mouseReleasedRect(e);
		}
	}

	/** Invoked when the mouse is dragged over a component */
	public void mouseDragged(MouseEvent e) {
		if (figureSelected == FigureTypes.RECT) {
			mouseDraggedRect(e);
		}
	}

	protected BasicRectangle newRect = null;

	public void mousePressedRect(MouseEvent e) {
		// If there is no line being created
		if (newRect == null) {
			newRect = new BasicRectangle(e.getX(), e.getY());
			shapes.add(newRect);
		}
	}

	/** Updates the end point coordinates and repaints figure */
	public void mouseDraggedRect(MouseEvent e) {
		newRect.setEnd(e.getX(), e.getY());
		repaint();
	}

	/** Clears the reference to the new line */
	public void mouseReleasedRect(MouseEvent e) {
		newRect = null;
	}

}
