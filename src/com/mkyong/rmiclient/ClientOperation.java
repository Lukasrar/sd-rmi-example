package com.mkyong.rmiclient;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import com.mkyong.rmiinterface.RMIInterface;

public class ClientOperation {
	private static RMIInterface look_up;

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String txt = JOptionPane.showInputDialog("Qual seu nome ?");
			
		String response = look_up.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);
	}
}

//o cliente usa um objeto RMIInterface que 
//“procura” por uma referência para o objeto 
//remoto associado ao nome que passamos como 
//parâmetro. Com a RMIInterface, 
//agora podemos conversar com o servidor e 
//receber respostas.