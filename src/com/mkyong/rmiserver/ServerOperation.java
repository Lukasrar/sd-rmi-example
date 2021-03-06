package com.mkyong.rmiserver;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.mkyong.rmiinterface.RMIInterface;

public class ServerOperation extends UnicastRemoteObject implements RMIInterface{
	private static final long serialVersionUID = 1L;

	protected ServerOperation() throws RemoteException {
		super();
	}

	@Override
	public String helloTo(String name) throws RemoteException{
		System.err.println(name + " est� tentando contato.");
		return "Servidor - contato com " + name + " conclu�do.";
	}
	
	public static void main(String[] args){
		try {
			Naming.rebind("//localhost/MyServer", new ServerOperation());            
            System.err.println("Servidor pronto!");
            
        } catch (Exception e) {
        	System.err.println("Server exception: " + e.toString());
          e.printStackTrace();
        }
	}
}

//O servidos extende UnicastRemoteObject e implementa a interface RMI
//Na main existe o bind do localhost com o nome MyServer

