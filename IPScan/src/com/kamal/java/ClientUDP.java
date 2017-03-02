package com.esisa.java;
import java.io.*;
import java.net.*;

public class ClientUDP {
	private ServerSocket socketEcoute;
	private Socket socketService;
	private InputStream entreeSocket;
	private OutputStream sortieSocket;
 
 
	// constructeur, crÃ©er un Serveur
	public ClientUDP(int numPort){
		try{
		//crÃ©ation du socket d'Ã©coute (port numPort)
		socketEcoute = new ServerSocket(numPort);
 
		}catch (Exception ex){
      			// erreur de connexion
      			System.err.println("Une erreur est survenue : "+ex);
      			ex.printStackTrace();
    		}	
	}
 
	// attente d'une connexion
	public void attenteConnexion(){
		try{
			// attente d'une demande de connexion
			socketService = socketEcoute.accept();
			
			System.out.println("Nouvelle connexion : " + socketService); // pour test...
 
			// récupération des flux d'entrée/sortie de la socket de service
			entreeSocket = socketService.getInputStream();
	        	sortieSocket = socketService.getOutputStream();		
 
		}catch (IOException ex){
          		// fin de connexion
          		System.out.println("Une erreur est survenue : "+ex);
          		ex.printStackTrace();
		}	
	}
 
	// methode qui retourne la chaine de caractere recue dans la socket ainsi que l'adresse de l'expéditeur, dans un 
	// tableau de String, 1er element du tableau = adresse, 2eme element = message 
	public  void receptionMessage(){
 
	//	String mess="";
		String strIpClient="";
	//	String tabMess[]=null;
 
	//	tabMess=new String[2];
 
		// afficher l'ip du client  ???
			InetAddress ipClient=socketService.getInetAddress();
			strIpClient=ipClient.getHostAddress();
	//		 System.out.println("reception message de "+strIpClient+" : "+mess);	// on fait deja cette affichage dans l'appelant										
 
	//	tabMess[0]=strIpClient;
		//tabMess[1]=mess;
 
		//return tabMess;	
 
	}
}
