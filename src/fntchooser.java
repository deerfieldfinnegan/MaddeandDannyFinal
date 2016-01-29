import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
	      JLabel labela = new JLabel("Select a font");
	      JPanel panelb = new JPanel();
	      panelb.add(labela);
	      panelb.add(fonts);
	      JButton button = new JButton ("Set font");
	      panelb.add(button);
	      JButton button3 = new JButton ("Text Color");
	      JButton button4 = new JButton ("Background Color");
	      JTabbedPane panela = new JTabbedPane();
	      panela.addTab("Fonts", panelb);
	      panela.addTab("Text Color", button3);
	      panela.addTab("Background Color", button4);
	      JTextField text = new JTextField(20);
	      JFrame frame = new JFrame("Text changer");
	      frame.setLayout(new FlowLayout());
	      frame.add(panela);
	      frame.add(text);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(600, 250);
	      frame.setVisible(true);
	}
}
	      