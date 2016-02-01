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
	
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();//Jd's code that gets the fonts from the users computer
	      String[] names = ge.getAvailableFontFamilyNames();//string of the fonts on the users computer
	      JList yes123 = new JList(names); // creates a new list
	      JScrollPane fonts = new JScrollPane(yes123);// scroll pane of the list with the fonts
	      class FontCellRenderer extends DefaultListCellRenderer {// code that sets each font to its own font
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
	      yes123.setCellRenderer(new FontCellRenderer()); // end of code that sets code to its own font
	      JLabel labela = new JLabel("Select a font"); //label for the selecting a font
	      JPanel panelz = new JPanel();
	      panelz.add(labela); // a panel that is for the Select a font a tab
	      panelz.add(fonts);
          String outputText = "<html>" // the preview text
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
	  	  JLabel output_Text = new JLabel (outputText,JLabel.CENTER); //taking the preview text and turning it into a jlabel to add
          JFrame preview = new JFrame (); // new jframe for the preview
          JPanel preview1 = new JPanel (); //new panel for the jframe preview
          preview1.add(output_Text); //panel adding the jlabel with the preview text
          preview.add(preview1); //jframe adding the jpanel with preview text et cetera
	      JTabbedPane panela = new JTabbedPane(); //different tabs created
	      JColorChooser font = new JColorChooser(); // color chooser for the fonts
	      JColorChooser background = new JColorChooser(); // color chooser for the background
	      panela.addTab("Fonts", panelz); //tab for the font chooser and the panel
	      panela.addTab("Text Color", font); // color chooser for the text
	      panela.addTab("Background Color", background); // color chooser for the background
	      JFrame frame = new JFrame("Text changer"); //the main jframe
	      frame.setLayout(new FlowLayout()); //layout style for main frame
	      frame.add(panela); //adding the tabs
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(750, 500); //size of the frame
	      frame.setVisible(true);
	      preview.setSize(500, 500); //setting the size of the other frame 
	      output_Text.setBackground(Color.WHITE);
	      preview.setVisible(true);
	      yes123.addListSelectionListener(new ListSelectionListener() { //listener for selecting the font
	  	      public void valueChanged(ListSelectionEvent e) {
	  	    	  String select = yes123.getSelectedValue().toString();
	  	    	  output_Text.setFont(new Font(select,Font.PLAIN, 12));
	  	      }
	  	    });
	      ColorSelectionModel backgroundcolor = background.getSelectionModel();
	      ChangeListener backgroundchangeListener = new ChangeListener() { // background color chooser listener added 
	        public void stateChanged(ChangeEvent a) {
	          Color bgroundcolor = background.getColor();
	          preview1.setBackground(bgroundcolor);
	        }
	      };
	     backgroundcolor.addChangeListener(backgroundchangeListener);
	      
	      ColorSelectionModel fontcolorchooser = font.getSelectionModel();
	      ChangeListener fontchangeListener = new ChangeListener() { //changing the text color listener
	        public void stateChanged(ChangeEvent a) {
	          Color fc = font.getColor();
	          output_Text.setForeground(fc);      }
	      };
	      fontcolorchooser.addChangeListener(fontchangeListener);
	      
	      
	      }
	}

	      