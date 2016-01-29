import java.awt.GraphicsEnvironment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleState;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.ComboPopup;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;

public class fntchooser extends JComboBox {
	public static void main(String[] args) {
	
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	      String[] names = ge.getAvailableFontFamilyNames();
	      JComboBox fonts = new JComboBox(names);
	      JPanel panela = new JPanel();
	      JLabel labela = new JLabel("Select a font");
	      panela.add(labela);
	      panela.add(fonts);
	      JButton button = new JButton ("Set font");
	      JButton button1 = new JButton ("Preview font");
	      JFrame frame = new JFrame("Text changer");
	      frame.setLayout(new FlowLayout());
	      frame.add(panela);
	      frame.add(button1);
	      frame.add(button);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(600, 250);
	      frame.setVisible(true);
	}
}
	      