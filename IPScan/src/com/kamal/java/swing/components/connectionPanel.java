package com.esisa.java.swing.components;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class connectionPanel extends JPanel{
     
    private JLabel l1=new JLabel(new ImageIcon("Source/image/true.png"));
    private JLabel l2=new JLabel(new ImageIcon("Source/image/false.png"));
    
	public connectionPanel() {
		super();
		add(new JLabel("connexion : "));
		add(l1);
		add(l2);
		init();
	}
	
	public void init(){
		l1.setVisible(false);
		l2.setVisible(false);
		this.setBackground(Color.WHITE);
	}
	
	 public void setConnect(){
		 l1.setVisible(true);
		 l2.setVisible(false);
		this.setBackground(Color.WHITE);
	}
	 
	 public void setDisconnect(){
		 l1.setVisible(false);
		 l2.setVisible(true);
		this.setBackground(Color.WHITE);
	}
	 
	 
}
