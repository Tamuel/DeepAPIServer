package com.ydk.deepAPI.domain;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DeepServer {
	private Socket socket;
	
	public DeepServer(String address, int port) {
		try {
			this.socket = new Socket(address, port);
		} catch (UnknownHostException e) {
			System.out.println("Cannot find host!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception occured!");
			e.printStackTrace();
		}
	}
	
	public DeepServer(int port) {
		try {
			this.socket = new Socket("127.0.0.1", port);
		} catch (UnknownHostException e) {
			System.out.println("Cannot find host!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO exception occured!");
			e.printStackTrace();
		}
	}
	
	public Socket getServer() {
		return socket;
	}
}
