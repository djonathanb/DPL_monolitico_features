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

	public enum FigureTypes {NONE, LINE, RECT};
	public FigureTypes figureSelected = FigureTypes.NONE;

}
