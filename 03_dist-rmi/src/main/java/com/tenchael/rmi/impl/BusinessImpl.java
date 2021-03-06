package com.tenchael.rmi.impl;

import java.rmi.RemoteException;

import com.tenchael.rmi.Business;

/**
 * 
 * @author Tenchael
 *
 */
public class BusinessImpl implements Business {

	public String echo(String message) throws RemoteException {
		if ("quit".equalsIgnoreCase(message.toString())) {
			System.out.println("Server will be shutdown!");
			System.exit(0);
		}
		System.out.println("Message from client: " + message);
		return "Server response：" + message;
	}

}
