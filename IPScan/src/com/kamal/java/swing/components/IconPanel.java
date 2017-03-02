package com.esisa.java.swing.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


public class IconPanel extends JLayeredPane implements MouseListener{
	
	private JLabel background,test;
	private JPanel content;
	private Icon backImage;
			
	public IconPanel (String backImageSource, String iconsFolders) {
		backImage = new ImageIcon(backImageSource);
		background = new JLabel(backImage);
		background.setBounds(0, 0, backImage.getIconWidth(), backImage.getIconHeight());//Position + taille
		
		content = new JPanel();
		content = new JPanel(new FlowLayout(FlowLayout.LEFT, 80, 80));//Box
		content.setBounds(40,100,400,500);
		content.setOpaque(false);//Pour rendre le pane invisible
		
		loadIcons(iconsFolders);
		
		test = new JLabel(new ImageIcon("resources/backgrounds/wp02.jpg"));
		test.setBackground(Color.blue);
		test.setBounds(0,0,backImage.getIconWidth(), backImage.getIconHeight());
		test.setVisible(false);
		
		this.add(content);
		this.add(background);
		
	}
	
	public void loadIcons(String iconsFolder){
		File folder = new File(iconsFolder);
		if(folder.isDirectory()){
				File f[] = folder.listFiles();
				for(int i= 0; i<f.length ; i++)
				{
					if(f[i].isFile()){
						ImageIcon icon = new ImageIcon(f[i].getPath());
						JLabel l = new JLabel(icon);
						l.setCursor(new Cursor(Cursor.HAND_CURSOR));
						l.addMouseListener(this);
						l.setName(f[i].getName());
						l.setToolTipText(f[i].getName());
						content.add(l);
					}
				}
				
		}
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(backImage.getIconWidth(), backImage.getIconHeight());
	}

	
	 public void mouseClicked(MouseEvent e) {
		  if (e.getButton() == MouseEvent.BUTTON1) {
		   JLabel src = (JLabel)e.getSource();
		   System.out.println(src.getName());
		   if (src.getName().equals("alert.png")) {//
		    test.setVisible(true);//
		    content.setVisible(false);
		   }
		  }
	}

	
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
	
	}

