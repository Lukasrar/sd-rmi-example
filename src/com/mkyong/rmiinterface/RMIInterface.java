package com.mkyong.rmiinterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
	public String helloTo(String name) throws RemoteException;
}

//Esta interface sera utilizada pelo Server e pelo cliente
//A interface necessita ser publica e extender Remote
//Esta interface possui apenas um metodo
//Param String
//Return String