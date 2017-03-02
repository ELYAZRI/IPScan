package com.esisa.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServeurUDP extends Thread {
	
	private int port;
	private DatagramPacket lettre;
	private DatagramSocket balr ;
	private ClientUDP c;
	
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
	

}
