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

    @Override
    public void run() {
       
        System.out.println("Client socket:    " + incoming.toString());
        System.out.println("----------------------------");
        boolean start = true;
        while (start == true) {
            try {
                
                switch (persontype(person_stream1))
                {
                 
                    case 1: 
                        //code 
                        System.out.println("In customer");
                            break; 
                    case 2:
                        //break
                        System.out.println("In supplier");
                            break;
                
                }
                
                
               

            } catch (Exception e) {
                e.printStackTrace();
                start = false;
            } finally {
                System.out.println("-------------fianlly---------------");
                return_message();
            }

        }
    }

    public String return_message() {
        String message;
        message = this.ICM_Client;

        System.out.println(message);
        return message;

    }

 
    
}
