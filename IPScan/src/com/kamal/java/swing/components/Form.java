package com.esisa.java.swing.components;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Hashtable;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

//import com.esisa.java.fichier.Contact;

public class Form extends JPanel {
	private int labelWidth;
	private Vector<LabeledTextField> fieldsVector;
	private Hashtable<String,LabeledTextField> fieldsHashtable; //key,value
	public Form() {
		this(100);
	
	}
	
	public Form(int labelWidth) {
		this.labelWidth = labelWidth;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		fieldsVector = new Vector<>();
		
		fieldsHashtable = new Hashtable<>();
	}
    public void setdisable(){
    	for (LabeledTextField  t : fieldsVector) {
			t.setdisable();
		}
    }
    public void setenable(){
    	for (LabeledTextField  t : fieldsVector) {
			t.setenable();
		}
    }
    public void setdisable(int i){
    	fieldsVector.get(i).setdisable();
    }
	public void addField(String label,int num, int size) throws Exception {
		
		LabeledTextField t = new LabeledTextField(label,num, size, labelWidth);
		add(t);
		fieldsVector.add(t);
		fieldsHashtable.put(label.toLowerCase(), t);
		
		
	}
	
	public void setValut(int index,String value){
		fieldsVector.get(index).setValue(value);
	}
	public void setValut(String label,String value){
		fieldsHashtable.get(label.toLowerCase()).setValue(value);
	}
	public String getValut(int index){
		return fieldsVector.get(index).getValue();
	}
	public String getValut(String label){
		return fieldsHashtable.get(label.toLowerCase()).getValue();
	}
	 public boolean ContactValid(){
		      
		   return true;
	   }
	
}

