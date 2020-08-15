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
	
	/** Invoked when a mouse button has been pressed on a component. */
	public void mousePressed(MouseEvent e) {
		
		if (figureSelected == FigureTypes.LINE) {
			mousePressedLine(e);
		}
		original(e);
		
	}
	
	
	

	/** Invoked when a mouse button has been released on a component. */
	public void mouseReleased(MouseEvent e) {
		if (figureSelected == FigureTypes.LINE) {
			mouseReleasedLine(e);
		}
		original(e);
	}

	/** Invoked when the mouse is dragged over a component */
	public void mouseDragged(MouseEvent e) {
		if (figureSelected == FigureTypes.LINE) {
			mouseDraggedLine(e);
		}
		original(e);
	}

	protected Line newLine = null;

	public void mousePressedLine(MouseEvent e) {
		// If there is no line being created
		if (newLine == null) {
			start = new Point(e.getX(), e.getY());
			newLine = new Line(start);
			shapes.add(newLine);
		}
	}

	/** Updates the end point coordinates and repaints figure */
	public void mouseDraggedLine(MouseEvent e) {
		newLine.setEnd(new Point(e.getX(), e.getY()));
		repaint();
	}

	/** Clears the reference to the new line */
	public void mouseReleasedLine(MouseEvent e) {
		newLine = null;
	}

}
