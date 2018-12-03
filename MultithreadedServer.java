package cnit325finalproject;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ateko
 */
public class MultithreadedServer extends Thread implements java.io.Serializable {

    //Declaration of variables
    Socket incoming = null;
    ObjectOutputStream outToClient = null;
    ObjectInputStream inFromClient = null;
    Customer customer_stream = new Customer("end", "end", "end", "end", "end", "end", "end", "end", "end");
    Supplier supplier_stream = new Supplier ("end", "end", "end","end", "end", "end","end", "end","end");
    Person person_stream1;
    String A = "";
    String ICM_Client = "";
    int size;
    int count = 0;
    Server server = null;

    public MultithreadedServer(Socket s, Person p, ObjectInputStream in, ObjectOutputStream out, int c, Server server) {
        this.incoming = s;
        this.person_stream1 = p;
        this.inFromClient = in;
        this.outToClient = out;
        this.count = c;
        this.server = server;
    }

    //run server
    @Override
    public void run() {
       
        System.out.println("Client socket:    " + incoming.toString());
        System.out.println("----------------------------");
        boolean start = true;
        while (start == true) {
            

        }
    }
    
    
    public String return_message() {
        String message;
        message = this.ICM_Client;

        System.out.println(message);
        return message;

    }

 
    
}
