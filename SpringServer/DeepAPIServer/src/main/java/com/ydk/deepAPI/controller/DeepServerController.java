package com.ydk.deepAPI.controller;

import com.ydk.deepAPI.domain.DeepServer;

public class DeepServerController {
	private DeepServer[] deepServers;
	
	public DeepServerController(int nServers) {
		deepServers = new DeepServer[nServers];
		
		// Temporary code to test
		deepServers[0] = new DeepServer(4040);
	}
	
}
