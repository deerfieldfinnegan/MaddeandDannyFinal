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
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
	      JList yes123 = new JList(names);
	      JScrollPane fonts = new JScrollPane(yes123);
	      class FontCellRenderer extends DefaultListCellRenderer {
	    	    public Component getListCellRendererComponent(
	    	        JList list,
	    	        Object value,
	    	        int index,
	    	        boolean isSelected,
	    	        boolean cellHasFocus) {
	    	        JLabel label = (JLabel)super.getListCellRendererComponent(
	    	            list,value,index,isSelected,cellHasFocus);
	    	        Font font = new Font((String)value, Font.PLAIN, 16);
	    	        label.setFont(font);
	    	        return label;
	    	    }
	    	}
	      yes123.setCellRenderer(new FontCellRenderer());
	      JLabel labela = new JLabel("Select a font");
	      JPanel panelz = new JPanel();
	      panelz.add(labela);
	      panelz.add(fonts);
	      JCheckBox Bold = new JCheckBox("Bold");
	      JCheckBox Italic = new JCheckBox("Italic");
	      panelz.add(Bold);
	      panelz.add(Italic);
          String outputText = "<html>"
	  			+ "The quick brown fox jumped over the lazy dog’s back.<br>"
	  			+ "Pack my box with five dozen liquor jugs.<br>"
	  			+ "Jackdaws love my big sphinx of quartz.<br>"
	  			+ "Mr. Jock, TV quiz PhD, bags few lynx.<br>"
	  			+ "abcdefghijklmnopqrstuvwxyz<br>"
	  			+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ<br>"
	  			+ "01234567890<br>"
	  			+ "€†™´¸¢©¤°÷½¼¾>¡¿«‘’<¯µ ·¬ªº¶±£\"»®§­¹²³ß×™¨¥<br>"
	  			+ "ÀÁÂÃÄÅÆÇÈÉ ÊËÌÍÎÏÐÑÒÓÔ ÕÖØÙÚÛÜÝÞÿ<br>"
	  			+ "àáâãäåæçèé êëìíîïðñòóô õöøùúûüýþÿ<br>"
	  			+ "!\"#$%&\'()*+,-./:;<=>?@[\\^_z{|}~<br>"
	  			+ "uvw wW gq9 2z 5s il17|!j oO08 `'\" ;:,. m nn rn {[()]}u<br>"
	  			+ "</html>";
	  	  JLabel output_Text = new JLabel (outputText,JLabel.CENTER);
          JFrame preview = new JFrame ();
          preview.add(output_Text);
	  	  JButton button3 = new JButton ("Text Color");
	      JButton button4 = new JButton ("Background Color");
	      JTabbedPane panela = new JTabbedPane();
	      JColorChooser font = new JColorChooser();
	      JColorChooser background = new JColorChooser();
	      panela.addTab("Fonts", panelz);
	      panela.addTab("Text Color", font);
	      panela.addTab("Background Color", background);
	      JFrame frame = new JFrame("Text changer");
	      button3.setSize(new Dimension(500, 300));
	      button4.setSize(new Dimension(500, 300));
	      frame.setLayout(new FlowLayout());
	      frame.add(panela);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(750, 500);
	      frame.setVisible(true);
	      preview.setSize(500, 500);
	      preview.setVisible(true);
	      yes123.addListSelectionListener(new ListSelectionListener() {
	  	      public void valueChanged(ListSelectionEvent e) {
	  	    	  String select = yes123.getSelectedValue().toString();
	  	    	  output_Text.setFont(new Font(select,Font.PLAIN, 12));
	  	      }
	  	    });
	      ColorSelectionModel backgroundcolor = background.getSelectionModel();
	      ChangeListener backgroundchangeListener = new ChangeListener() {
	        public void stateChanged(ChangeEvent changeEvent) {
	          Color bgroundcolor = background.getColor();
	          output_Text.setBackground(bgroundcolor);
	        }
	      };
	     backgroundcolor.addChangeListener(backgroundchangeListener);
	      
	      ColorSelectionModel fontcolorchooser = font.getSelectionModel();
	      ChangeListener fontchangeListener = new ChangeListener() {
	        public void stateChanged(ChangeEvent changeEvent) {
	          Color fc = font.getColor();
	          output_Text.setForeground(fc);      }
	      };
	      fontcolorchooser.addChangeListener(fontchangeListener);
	  

	      
	      }
	}

	      