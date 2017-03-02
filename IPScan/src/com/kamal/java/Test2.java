package com.esisa.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.esisa.LANScanner;
import com.esisa.java.swing.components.ButtonPanel;
import com.esisa.java.swing.components.ChoicePanel;
import com.esisa.java.swing.components.IconPanel;
import com.esisa.java.swing.components.LabeledTextField;
import com.esisa.java.swing.components.connectionPanel;

public class Test2  extends JFrame implements ActionListener{
	int ii=0;
	JPanel PD = new JPanel();
	JPanel PG = new JPanel();
	JComboBox combo1 = new JComboBox();
	connectionPanel c ;
	JLabel msg=new JLabel();

	LabeledTextField f1 = new LabeledTextField("De         ", 7,10);
	LabeledTextField f2 = new LabeledTextField("Jusqu'a", 7,10);
	JComboBox combo11;
	JComboBox combo12;
	public JLabel getMsg() {
		return msg;
	}


	public void setMsg(JLabel msg) {
		this.msg = msg;
	}

	JComboBox combo13;
	JComboBox combo14;
	JComboBox combo15;
	JComboBox combo16;
	JComboBox combo17;
	JComboBox combo18;
	JComboBox combo19;
	 connectionPanel c1 = new connectionPanel();
	 connectionPanel c2 = new connectionPanel();
	 connectionPanel c3 = new connectionPanel();
	 connectionPanel c4 = new connectionPanel();
	 connectionPanel c5 = new connectionPanel();
	 connectionPanel c6 = new connectionPanel();
	 connectionPanel c7 = new connectionPanel();
	 connectionPanel c8 = new connectionPanel();
	 connectionPanel c9 = new connectionPanel();
	
	 
	JPanel G;
	private JProgressBar bar;
	
	public JPanel getG() {
		return G;
	}


	public void setG(JPanel g) {
		G = g;
	}


	public JProgressBar getBar() {
		return bar;
	}


	public void setBar(JProgressBar bar) {
		this.bar = bar;
	}


	public JComboBox getCombo11() {
		return combo11;
	}


	public void setCombo11(JComboBox combo11) {
		this.combo11 = combo11;
	}


	public JComboBox getCombo12() {
		return combo12;
	}


	public void setCombo12(JComboBox combo12) {
		this.combo12 = combo12;
	}


	public JComboBox getCombo13() {
		return combo13;
	}


	public void setCombo13(JComboBox combo13) {
		this.combo13 = combo13;
	}


	public JComboBox getCombo14() {
		return combo14;
	}


	public void setCombo14(JComboBox combo14) {
		this.combo14 = combo14;
	}


	public JComboBox getCombo15() {
		return combo15;
	}


	public void setCombo15(JComboBox combo15) {
		this.combo15 = combo15;
	}


	public JComboBox getCombo16() {
		return combo16;
	}


	public void setCombo16(JComboBox combo16) {
		this.combo16 = combo16;
	}


	public JComboBox getCombo17() {
		return combo17;
	}


	public void setCombo17(JComboBox combo17) {
		this.combo17 = combo17;
	}


	public JComboBox getCombo18() {
		return combo18;
	}


	public void setCombo18(JComboBox combo18) {
		this.combo18 = combo18;
	}


	public JComboBox getCombo19() {
		return combo19;
	}


	public void setCombo19(JComboBox combo19) {
		this.combo19 = combo19;
	}

    
	public connectionPanel getC() {
		return c;
	}


	public void setC(connectionPanel c) {
		this.c = c;
	}


	public connectionPanel getC1() {
		return c1;
	}


	public void setC1(connectionPanel c1) {
		this.c1 = c1;
	}


	public connectionPanel getC2() {
		return c2;
	}


	public void setC2(connectionPanel c2) {
		this.c2 = c2;
	}


	public connectionPanel getC3() {
		return c3;
	}


	public void setC3(connectionPanel c3) {
		this.c3 = c3;
	}


	public connectionPanel getC4() {
		return c4;
	}


	public void setC4(connectionPanel c4) {
		this.c4 = c4;
	}


	public connectionPanel getC5() {
		return c5;
	}


	public void setC5(connectionPanel c5) {
		this.c5 = c5;
	}


	public connectionPanel getC6() {
		return c6;
	}


	public void setC6(connectionPanel c6) {
		this.c6 = c6;
	}


	public connectionPanel getC7() {
		return c7;
	}


	public void setC7(connectionPanel c7) {
		this.c7 = c7;
	}


	public connectionPanel getC8() {
		return c8;
	}


	public void setC8(connectionPanel c8) {
		this.c8 = c8;
	}


	public connectionPanel getC9() {
		return c9;
	}


	public void setC9(connectionPanel c9) {
		this.c9 = c9;
	}


	public Test2() throws Exception{
			
	G = new JPanel();
	G.setLayout(new BorderLayout());

    JPanel p1 =  new JPanel();
    PD.setLayout(new BoxLayout(PD, BoxLayout.Y_AXIS));
    PD.setLayout(new BorderLayout());
    
    JPanel p01 =  new JPanel();
    PG.setLayout(new BoxLayout(PG, BoxLayout.Y_AXIS));
    PD.setLayout(new BorderLayout());

   
    
    JLabel lb2 = new JLabel(" "); 
    lb2.setFont(new Font("Impact", Font.BOLD,30));
    
    combo1.addItem("Information");
     c = new connectionPanel();

    c.setConnect();     //c.getComponent(2).
	ButtonPanel b1 = new ButtonPanel(new String[]{"Search","Exit"});
	b1.addActionListener(this);
    IconPanel p001 = new IconPanel("Source/image/Ordinateur2.png","Source");
    JPanel p02 = new JPanel();
 
    p02.setLayout(new BoxLayout(p02, BoxLayout.Y_AXIS));
  
    p02.add(lb2);
  //  p02.add(lb1);
    p02.add(lb2);
    p02.add(f1);
    p02.add(f2);
    p02.add(lb2);
    p02.add(lb2);
	p02.add(p001);
	p02.add(lb2);
	p02.add(combo1);
	p02.add(lb2);
	p02.add(lb2);
	p02.add(c);
	p02.add(lb2);
	p02.add(b1);
	p02.add(lb2);
    bar  = new JProgressBar();
	bar.setStringPainted(true);
	p02.add(bar);
	p02.setBackground(Color.WHITE);
	//p02.setBackground(Color.black);
    
   
    IconPanel p11 = new IconPanel("Source/image/Ordinateur1.png","Source");
    JLabel l1 = new JLabel("                 Poste1");
    JPanel p2 = new JPanel();
    combo11 = new JComboBox();
    combo11.addItem(" I N F O R M A T I O N...");
    p2.add(l1);
	p2.add(p11);
	p2.add(combo11);
	p2.add(c1);
	p2.setBackground(Color.WHITE);
	
	
	IconPanel p22 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l2 = new JLabel("                 Poste2");
	JPanel p3 = new JPanel();
    combo12 = new JComboBox();
	combo12.addItem("  I N F O R M A T I O N...");
	p3.add(l2);
	p3.add(p22);
	p3.add(combo12);
	p3.add(c2);
	p3.setBackground(Color.WHITE);
		
    IconPanel p33 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l3 = new JLabel("                 Poste3");
    JPanel p4 = new JPanel();
    combo13 = new JComboBox();
	combo13.addItem("  I N F O R M A T I O N...");
    p4.add(l3);
	p4.add(p33);
	p4.add(combo13);
	p4.add(c3);
	p4.setBackground(Color.WHITE);
	
	IconPanel p44 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l4 = new JLabel("                 Poste4");
	JPanel p5 = new JPanel();
	combo14 = new JComboBox();
    combo14.addItem("  I N F O R M A T I O N...");
	p5.add(l4);
	p5.add(p44);
	p5.add(combo14);
	p5.add(c4);
	p5.setBackground(Color.WHITE);
	
	IconPanel p55 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l5 = new JLabel("                 Poste5");
	JPanel p6 = new JPanel();
	combo15 = new JComboBox();
    combo15.addItem("  I N F O R M A T I O N...");
	p6.add(l5);
	p6.add(p55);
	p6.add(combo15);
	p6.add(c5);
	p6.setBackground(Color.WHITE);
	
	IconPanel p66 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l6 = new JLabel("                 Poste6");
	JPanel p7 = new JPanel();
	combo16 = new JComboBox();
    combo16.addItem("  I N F O R M A T I O N...");
	p7.add(l6);
	p7.add(p66);
	p7.add(combo16);
	p7.add(c6);
	p7.setBackground(Color.WHITE);
	
	IconPanel p77 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l7 = new JLabel("                 Poste7");
	JPanel p8 = new JPanel();
	combo17 = new JComboBox();
    combo17.addItem(" I N F O R M A T I O N...");
	p8.add(l7);
	p8.add(p77);
	p8.add(combo17);
	p8.add(c7);
	p8.setBackground(Color.WHITE);
	
	IconPanel p99 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l8 = new JLabel("                 Poste8");
	JPanel p9 = new JPanel();
	combo18 = new JComboBox();
    combo18.addItem("  I N F O R M A T I O N...");
	p9.add(l8);
	p9.add(p99);
	p9.add(combo18);
	p9.add(c8);
	p9.setBackground(Color.WHITE);
	
	IconPanel p10 = new IconPanel("Source/image/Ordinateur1.png","Source");
	JLabel l9 = new JLabel("                 Poste9");
	JPanel p010 = new JPanel();
	combo19 = new JComboBox();
    combo19.addItem("  I N F O R M A T I O N...");
	p010.add(l9);
	p010.add(p10);
	p010.add(combo19);
	p010.add(c9);
	
	
	
	p010.setBackground(Color.WHITE);
	p1.setLayout(new GridLayout(4, 5, 10, 10));
	//p01.setLayout(new GridLayout(4, 5, 5, 5));
	// p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
	p1.add(p2);
	p1.add(p3);
	p1.add(p4);
	p1.add(p5);
	p1.add(p6);
	p1.add(p7);
	p1.add(p8);
	p1.add(p9);
	p1.add(p010);
	
	p01.add(p02);
	
	JPanel pMsg=new JPanel();
	pMsg.add(msg);
	pMsg.setBackground(Color.WHITE);
	p1.setBackground(Color.WHITE);
	p01.setBackground(Color.WHITE);
	Border border=BorderFactory.createTitledBorder("Clients");
	Border border1=BorderFactory.createTitledBorder("Serveur");
	PD.setBorder(border);
	PD.add(p1);
	PG.setBorder(border1);
	PG.add(p01);
	PD.setBackground(Color.WHITE);
	PD.add(pMsg,BorderLayout.SOUTH);
	PG.setBackground(Color.WHITE);
	G.add(PD,BorderLayout.CENTER);
	G.add(PG,BorderLayout.WEST);
	G.setBackground(Color.WHITE);
	setContentPane(G);
	setSize(1370,685);
    setVisible(true);
    
	}


	public static void main(String[] args) throws Exception {
		new Test2();
	}

	public void actionPerformed(ActionEvent e) {
	JButton src = (JButton)e.getSource();
		String hostname =null;
		switch(src.getText()){
		case "Search":
			if(f1.getValue().toString().length()!=15 || f2.getValue().toString().length()!=15) break;
			 InetAddress ip,ipclient;
		        try {

		            ip = InetAddress.getLocalHost();
		         
		            System.out.println(" IP address : " + ip.getHostAddress());
		            System.out.println(" Nom machine : " + ip.getHostName());
		      
		            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

		            byte[] mac = network.getHardwareAddress();

		            System.out.print(" MAC address : ");

		            StringBuilder sb = new StringBuilder();
		            for (int i = 0; i < mac.length; i++) {
		                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
		            }
		            System.out.println(sb.toString());
		            combo1.removeAllItems();
		            combo1.addItem("Nom         :   "+ip.getHostName());
		            combo1.addItem("Adresse ip  :   "+ ip.getHostAddress());
		            combo1.addItem("Adresse MAC :   "+ sb);
		      
		        
		        } catch (UnknownHostException e1) {

		            e1.printStackTrace();

		        } catch (SocketException e1){

		            e1.printStackTrace();
		            
		        }
		        LANScanner lan = new LANScanner();
		        System.out.println(f1.getValue());
		        String[] s1= f1.getValue().split("\\.");
		        String[] s2= f2.getValue().split("\\.");
		        int x=Integer.parseInt(s1[3]);
		        int y= Integer.parseInt(s2[3]);
		        
		        lan.enumLocalNetwork(f1.getValue(),x,y,this);
		       
		        break;
		case "Exit":
			
			System.exit(0);
			 break;
		
		
		}
		
	}
	
}
