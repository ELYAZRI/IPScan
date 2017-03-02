package com.esisa.java.swing.components;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChoicePanel extends JPanel {
	public static final int RADIO = 0;
	public static final int CHECKBOX = 1;
	public static final int HORIZONTAL = 0;
	public static final int VERTICAL = 1;
	
	public ChoicePanel(String label, String... choice) {
		this(HORIZONTAL,RADIO, label, choice);
		this.setBackground(Color.white);
	}

	public ChoicePanel(int type, String label, String... choice) {
		this(HORIZONTAL, type, label, choice);
		this.setBackground(Color.white);
	}

	public ChoicePanel(int Allign, int type, String label, String... choice) {
		
		if (!label.contains(":"))
			label = label + " : ";
		JLabel l = new JLabel(label);
		this.setBackground(Color.white);
		
		JPanel container;
			
		if(Allign == HORIZONTAL){
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(l);
			container = this;
			this.setBackground(Color.white);
		}
		else{
			setLayout(new BorderLayout());
			add("North",l);
			JPanel p = new JPanel();
			p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
			add("Center",p);
			container = p;
			this.setBackground(Color.white);
			
		}
		if (type == RADIO) {
			ButtonGroup b = new ButtonGroup();
			for (int i = 0; i < choice.length; i++) {
				JRadioButton r = new JRadioButton(choice[i]);
				r.setBackground(Color.WHITE);
				container.add(r);
				b.add(r);
				container.setBackground(Color.white);
			
				
			}
		} else
			if (type == CHECKBOX) {
			for (int i = 0; i < choice.length; i++) {
				JCheckBox r = new JCheckBox(choice[i]);
				r.setBackground(Color.WHITE);
				container.add(r);
				container.setBackground(Color.white);
			}
		}
		
	}

}
