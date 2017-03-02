package com.esisa.java.swing.components;


import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar{
	private Vector<JMenuItem> items;
	public Menu(String m[][]) {
		items=new Vector<>();
		for (int i = 0; i < m.length; i++) {
			createMenu(m[i]);
		}
	}
	private void createMenu(String s[]) {
		
		JMenu m = new JMenu(s[0]);
		for (int i = 1; i < s.length; i++) {
			if (s[i].equals("-")) m.addSeparator();
			else {
				JMenuItem mi = new JMenuItem(s[i], 
				new ImageIcon("sources/icons/" + s[i].toLowerCase() + ".png"));
				m.add(mi);
				items.add(mi);
			}
		}
		add(m);
	}
	public void addActionListener(ActionListener al){
		for (JMenuItem m : items) {
			m.addActionListener(al);
		}
	}
	
}
