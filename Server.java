package cnit325finalproject;



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ateko
 */
public class Server implements  java.io.Serializable {
       Person person_stream1 = new Person ("end","","end");   
       ArrayList<Person> Person_list = new ArrayList<>();
       ArrayList< MultithreadedServer> mts_list = new ArrayList<>();
       int count ;
       String ICM_Client = "";       
       ObjectInputStream inFromClient = null;
       ObjectOutputStream outToClient = null;
       MultithreadedServer MtS = null; 
       
    public Server(int port){  
 
    try
        {
            
            ServerSocket s = new ServerSocket(port);             
            System.out.println("Server started");
            System.out.println("TCPServer Waiting for client on port 8189");            
            while (true)
            {                
            Socket incoming = s.accept();  
            inFromClient = new ObjectInputStream(incoming.getInputStream());
            outToClient = new ObjectOutputStream(incoming.getOutputStream());            
            System.out.println("Client connected");
            count++;               
            System.out.println("count :" + count);       
             person_stream1 = (Person)(inFromClient.readObject()); 
             Person_list.add(count-1, person_stream1);         
          
            System.out.println("Array list size :    "+Person_list.size());
            for (int i = 0; i < Person_list.size(); i++)
            {
                System.out.println("Person Name " + Person_list.get(i).getName());
            }
           
            System.out.println("End list");
            System.out.println("-----------sending count to user-----------------");              
            System.out.println("----------------count sent------------");   
            MtS = new MultithreadedServer(incoming,person_stream1,inFromClient,outToClient,count, this);
            mts_list.add(MtS);
            System.out.println("----------------------------");
            System.out.println("Multi threaded server started");
            MtS.start();
         
            
            

          
    }
        }
    catch (Exception e)
    {
        
        e.printStackTrace();
        System.out.println("Connection Error");
    }
        
    
}
  
    public void send_message_client(String msg)
    {
    for (MultithreadedServer m : mts_list)
    {
        m.send_message(msg);
    }
    }

}

