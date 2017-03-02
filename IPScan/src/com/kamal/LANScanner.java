package com.esisa;
import java.awt.Graphics;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.esisa.java.Test2;
 
/*
 * Scanner les postes sur un reseau local
 *
 * @author Fobec 03/201
 * @see http://www.fobec.com/java/1141/scanner-postes-sur-reseau-local.html
 */
public class LANScanner {
 
    /*
     * Parcourir l'ensemble du réseau pour détecter les postes de travail ou les
     * serveurs
     *
     * @param iproot plage de départ du scan
     */
    public void enumLocalNetwork(String iproot,int x,int y,Test2 t) {
        //Test base Ip valide
    	//t.update(null);
    	System.out.println(t.getCombo11().getItemAt(0).toString());
        String[] nip = iproot.split("\\.");
        if (nip.length != 4) {
            System.out.println("Base Ip incorrecte !!! exemple 192.168.1.16");
            return;
        }
 
        //timer
        int ifound = 0;
        Long timestart = System.currentTimeMillis();
 
        //Entete du tableau
        System.out.printf("%-30s %-30s %-10s \n", "Adresse ip", "Nom du poste", "Port ouvert");
        byte[] ip = {(byte) Integer.parseInt(nip[0]), (byte) Integer.parseInt(nip[1]),
            (byte) Integer.parseInt(nip[2]), (byte) 0};
   
        //Boucle sur l'ensemble du masque réseau
        int k=1;
        t.getBar().setMaximum(y);
        t.getBar().setMinimum(x);
        
        for (int i = x; i <=y; i++) {
        	t.getBar().setValue(i);
            ip[3] = (byte) i;
            try {
                InetAddress addr = InetAddress.getByAddress(ip);
                if (isAlive(addr.getHostAddress())) {
                	switch (k) {
					case 1:
						t.getCombo11().removeAllItems();
						t.getCombo11().addItem("Nom  :" + addr.getHostName());
						t.getCombo11().addItem(addr.getHostAddress());
						t.getCombo11().addItem("ports ouverts : ");
						t.getCombo11().addItem(scanPort(addr.getHostAddress()));
						t.getC1().setConnect();
						break;
                    case 2:
                    	t.getCombo12().removeAllItems();
						t.getCombo12().addItem("Nom  :" + addr.getHostName());
						t.getCombo12().addItem(addr.getHostAddress());
						t.getCombo12().addItem("ports ouverts : ");
						t.getCombo12().addItem(scanPort(addr.getHostAddress()));
						t.getC2().setConnect();
						break;
                    case 3:
                    	t.getCombo13().removeAllItems();
						t.getCombo13().addItem("Nom  :" + addr.getHostName());
						t.getCombo13().addItem(addr.getHostAddress());
						t.getCombo13().addItem("ports ouverts : ");
						t.getCombo13().addItem(scanPort(addr.getHostAddress()));
						t.getC3().setConnect();

						break;
                    case 4:
                    	t.getCombo14().removeAllItems();
                    	
						t.getCombo14().addItem("Nom  :" + addr.getHostName());
						t.getCombo14().addItem(addr.getHostAddress());
						t.getCombo14().addItem("ports ouverts : ");
						t.getCombo14().addItem(scanPort(addr.getHostAddress()));
						t.getC4().setConnect();

                    	break;
                    case 5:
                    	t.getCombo15().removeAllItems();
						t.getCombo15().addItem("Nom    :   " + addr.getHostName());
						t.getCombo15().addItem(addr.getHostAddress());
						t.getCombo15().addItem("ports ouverts : ");
						t.getCombo15().addItem(scanPort(addr.getHostAddress()));
						t.getC5().setConnect();

                    	break;
                    case 6:
                    	t.getCombo16().removeAllItems();
						t.getCombo16().addItem("Nom  :" + addr.getHostName());
						t.getCombo16().addItem(addr.getHostAddress());
						t.getCombo16().addItem("ports ouverts : ");
						t.getCombo16().addItem(scanPort(addr.getHostAddress()));
						t.getC6().setConnect();

                    	break;
                    case 7:
                    	t.getCombo17().removeAllItems();
						t.getCombo17().addItem("Nom  :" + addr.getHostName());
						t.getCombo17().addItem(addr.getHostAddress());
						t.getCombo17().addItem("ports ouverts : ");
						t.getCombo17().addItem(scanPort(addr.getHostAddress()));
						t.getC7().setConnect();

						break;
					case 8:
						t.getCombo18().removeAllItems();
						t.getCombo18().addItem("Nom  :" + addr.getHostName());
						t.getCombo18().addItem(addr.getHostAddress());
						t.getCombo18().addItem("ports ouverts : ");
						t.getCombo18().addItem(scanPort(addr.getHostAddress()));
						t.getC8().setConnect();

							break;
					case 9:
						t.getCombo19().removeAllItems();
						t.getCombo19().addItem("Nom    :   " + addr.getHostName());
						t.getCombo19().addItem(addr.getHostAddress());
						t.getCombo19().addItem("ports ouverts : ");
						t.getCombo19().addItem(scanPort(addr.getHostAddress()));	
						t.getC9().setConnect();

								break;
					default:
						break;
					}
                    System.out.printf("%-30s %-30s %-10s \n", addr.getHostAddress(),
                            addr.getHostName(), scanPort(addr.getHostAddress()));
                    ifound++;
                   
                } else {
                	switch (k) {
					case 1:
						t.getCombo11().removeAllItems();
						t.getCombo11().addItem(addr.getHostAddress());
						t.getCombo11().addItem("Introuvable ");
						t.getC1().setDisconnect();
						break;
                    case 2:
                    	t.getCombo12().removeAllItems();
						t.getCombo12().addItem(addr.getHostAddress());
						t.getCombo12().addItem("Introuvable ");
						t.getC2().setDisconnect();
						break;
                    case 3:
                    	t.getCombo13().removeAllItems();
						t.getCombo13().addItem(addr.getHostAddress());
						t.getCombo13().addItem("Introuvable ");
						t.getC3().setDisconnect();
						break;
                    case 4:
                    	t.getCombo14().removeAllItems();
						t.getCombo14().addItem(addr.getHostAddress());
						t.getCombo14().addItem("Introuvable ");
						t.getC4().setDisconnect();
                    	break;
                    case 5:
                    	t.getCombo15().removeAllItems();
						t.getCombo15().addItem(addr.getHostAddress());
						t.getCombo15().addItem("Introuvable ");
						t.getC5().setDisconnect();
                    	break;
                    case 6:
                    	t.getCombo16().removeAllItems();
						t.getCombo16().addItem(addr.getHostAddress());
						t.getCombo16().addItem("Introuvable ");
						t.getC6().setDisconnect();
                    	break;
                    case 7:
                    	t.getCombo17().removeAllItems();
						t.getCombo17().addItem(addr.getHostAddress());
						t.getCombo17().addItem("Introuvable ");
						t.getC7().setDisconnect();
						break;
					case 8:
						t.getCombo18().removeAllItems();
						t.getCombo18().addItem(addr.getHostAddress());
						t.getCombo18().addItem("Introuvable ");
						t.getC8().setDisconnect();
							break;
					case 9:
						t.getCombo19().removeAllItems();
						t.getCombo19().addItem(addr.getHostAddress());
						t.getCombo19().addItem("Introuvable ");
						t.getC9().setDisconnect();
								break;
					default:
						break;
					}
                
                	System.out.printf("%-30s %-30s %-10s \n",addr.getHostAddress() , " introuvable" , "introuvable");
                }
            } catch (UnknownHostException e) {
                System.out.println(e.getMessage());
            }
           // t.update(null);
            k++;
          
        }
        Long timeelapse = System.currentTimeMillis() - timestart;
        String s= ifound+ " postes détectés sur le réseau "
                + " en " + Math.round(timeelapse / 1000) + " secondes";
        System.out.println(s);
        t.getMsg().setText(s);
    }
 
    /*
     * Ping sur une adresse ip
     *
     * @param Ipv4Adr ip adresse ip du poste
     * @return boolean
     */
    private boolean isAlive(String Ipv4Adr) {
        Process p1;
        boolean reachable = false;
        try {
            p1 = java.lang.Runtime.getRuntime().exec("ping -w 2 -n 2 " + Ipv4Adr);
            int returnVal = p1.waitFor();
            reachable = (returnVal == 0);
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(LANScanner.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reachable;
    }
 
    /*
     * Exemple de plage de port à scanner
     *
     * @param ip adresse ip du poste
     * @return String
     */
    private String scanPort(String ip) {
        String openPort = "";
 
        //Port de communication FTP
        if (portIsOpen(ip, 21, 100)) {
            openPort += " FTP";
        }
        //Port standard pour le web, par ex Apache
        if (portIsOpen(ip, 80, 100)) {
            openPort += " Http";
        }
        //Port d'une imprimante
        if (portIsOpen(ip, 515, 100)) {
            openPort += " Printer";
        }
        //Port du serveur MySql
        if (portIsOpen(ip, 3306, 100)) {
            openPort += " MySql";
        }
 
        return openPort.trim();
    }
 
    /*
     * Tester l'état du port sur un poste
     *
     * @param ip adresse ip du poste
     * @param port Numero du port
     * @param timeout délai en ms
     * @return port ouvert ou non
     */
    private boolean portIsOpen(String ip, int port, int timeout) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(ip, port), timeout);
            socket.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
 
    /*
     * Exemple de scan sur la plage 192.168.2.0
     *
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        LANScanner lan = new LANScanner();
       // lan.enumLocalNetwork("192.168.1.0",2,2,new Test2());
        
    }
}