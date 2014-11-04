package model.gui;

import java.awt.*;
import javax.swing.*;

public class FieldPanel extends JPanel
{
	private JLabel label;
	private JTextField textField;
	
	public FieldPanel (String name , int characters) 
	{
		label = new JLabel (name , JLabel.LEFT);
		textField = new JTextField(characters);
		
		add (label);
		add (textField);
		
		setLayout (new FlowLayout (FlowLayout.LEFT));
	}
	
	public JTextField getTextField ()
	{
		return textField;
	}
	
	public void setTextField (String s)
	{
		textField.setText(s);
	}
}