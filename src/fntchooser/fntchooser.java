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

	public static void main(String[] args){
	  Button b;
	  GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      JComboBox fonts = new JComboBox(names);
      fonts.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      String s = (String) fonts.getSelectedItem();
      
      
    	  
      JFrame frame = new JFrame("Font Type");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     
      fonts.setUI((ComboBoxUI) MyComboBoxUI.createUI(fonts));
      frame.add(fonts, BorderLayout.NORTH);

      frame.setSize(300, 200);
      frame.setVisible(true);
    

    static class MyComboBoxUI extends BasicComboBoxUI {
      public static ComponentUI createUI(JComponent c) {
        return new MyComboBoxUI();
      }

      protected JButton createArrowButton() {
        JButton button = new BasicArrowButton(BasicArrowButton.SOUTH);
       return button;
      


