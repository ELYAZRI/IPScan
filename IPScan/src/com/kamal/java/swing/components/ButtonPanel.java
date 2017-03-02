package com.esisa.java.swing.components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private Hashtable<String, JButton> buttons;
	public ButtonPanel(String ...labels) {
		//setLayout(new FlowLayout(FlowLayout.RIGHT));
		buttons = new Hashtable<>();
		for (int i = 0; i < labels.length; i++) {
			JButton b = new JButton(labels[i], new ImageIcon("source/image/"+ labels[i]+ ".gif"));
			add(b);
			buttons.put(labels[i].toLowerCase(), b);
			this.setBackground(Color.WHITE);
		}
	}
	
	public void addActionListener(int index, ActionListener al) {
		((JButton)getComponent(index)).addActionListener(al);
	}
	
	public void addActionListener(String label, ActionListener al) {
		buttons.get(label.toLowerCase()).addActionListener(al);
	}
	
	public void addActionListener(ActionListener al) {
		for (int i = 0; i < getComponentCount(); i++) {
			((JButton)getComponent(i)).addActionListener(al);
		}
	}
	
	
}
