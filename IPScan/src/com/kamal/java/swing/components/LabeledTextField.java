package com.esisa.java.swing.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class LabeledTextField extends JPanel {
	private JFormattedTextField text;
	private JLabel label;
	private int num;
	private boolean accepting;
	public LabeledTextField(String label,int num, int size) throws Exception {
		this(label, num,size, 100);
	}
	
    public LabeledTextField(String label,int num, int size, int labelWidth) throws Exception {
    	  MaskFormatter mf1 = new MaskFormatter("192.168.###.###");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if (!label.contains(":")) label = label + " : ";
		this.label = new JLabel(label);
		
		 Font police1 = new Font("Arial", Font.BOLD, 14);
		this.label.setFont(police1);
		this.label.setForeground(Color.BLUE);
		
		this.text=new JFormattedTextField(mf1);
					  Font police2 = new Font("Arial", Font.CENTER_BASELINE, 14);
				     this.text.setFont(police2);
				     this.text.setPreferredSize(new Dimension(120, 28));
				     this.text.setForeground(Color.BLUE);
		
		this.num=num;
		this.accepting=false;
	
		add(this.label);
		add(this.text);
		this.label.setPreferredSize(new Dimension(labelWidth, 20));
		this.setBackground(Color.WHITE);
	}
   
	public void setdisable(){
		text.disable();
		
	}
	public void setenable(){
		text.enable();
		
	}
	public void setValue(String value){
		text.setText(value);
	}
	
	public String getValue(){
		return text.getText();
	}
	public void setaccipting(boolean ac){
             accepting =ac;
	}
	
	public boolean getVaccepting(){
		return accepting;
	}
    
	
	

	
}
