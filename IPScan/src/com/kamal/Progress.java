package com.esisa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Progress extends JFrame{
	  private Thread t;
	  private JProgressBar bar;
	  private JButton launch ;
	   
	  public Progress() throws Exception{      
	     this.setBackground(Color.WHITE);
	    this.setSize(300, 100);
	    this.setTitle("*** JProgressBar ***");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);      
	      
	 
	    bar  = new JProgressBar();
	    bar.setBackground(Color.WHITE);
	    bar.setMaximum(500);
	    bar.setMinimum(0);
	    bar.setStringPainted(true);
	      
	    this.getContentPane().add(bar, BorderLayout.CENTER);
	      
	    launch = new JButton("Lancer");
	    launch.addActionListener(new ActionListener(){
	    	
	      public void actionPerformed(ActionEvent event){
	        t = new Thread(new Traitement());
	        t.start();            
	      }
	    });      
	    this.getContentPane().add(launch, BorderLayout.SOUTH);      
	     
	    this.setVisible(true);      
	  }

	  class Traitement implements Runnable{   
	    public void run(){
	 
	       launch.setEnabled(false);
	      for(int val = 0; val <= 500; val++){
	       
	    	  bar.setValue(val);
			        
			        try {
			          t.sleep(5);
			        } catch (InterruptedException e) {
			          // TODO Auto-generated catch block
			        e.printStackTrace();
			        }
	      }
	      launch.setEnabled(true);
	    }   
	  }

	  public static void main(String[] args) throws Exception{
	     new Progress();
	  }   
	}
