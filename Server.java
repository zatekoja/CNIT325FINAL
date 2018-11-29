package cnit325finalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;
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
public class Server implements java.io.Serializable {

    Customer customer_stream1 = new Customer("end", "end", "end", "end", "end", "end", "end", "end", "end");
    Person p01 = new Person("end", "end", "end", "end", "end", "end", "end", "end");
    ArrayList<Person> Client_list = new ArrayList<>();
    ArrayList<Person> Customer_list = new ArrayList<>();
    ArrayList<Person> Supplier_list = new ArrayList<>();
    //  ArrayList<Person> order_list = new ArrayList<>();
    ArrayList< MultithreadedServer> mts_list = new ArrayList<>();
    int client_count = 0;
    int customer_count = 0;
    int supplier_count = 0;

    ObjectInputStream inFromClient = null;
    ObjectOutputStream outToClient = null;
    MultithreadedServer MtS = null;
    FileWriter fw;
    Writer w;
    private File Customerdb_log = null;
    private File Supplierdb_log = null;
    private File Orderdb_log = null;
    Time t = new Time();

    public Server(int port) {

        try {

            ServerSocket s = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("TCPServer Waiting for client on port 8189");
            Customerdb_log = new File("C:/Users/ateko/Desktop/customerdb_log.txt");
            Supplierdb_log = new File("C:/Users/ateko/Desktop/supplierdb_log.txt");
            Orderdb_log = new File("C:/Users/ateko/Desktop/orderdb_log.txt");
            while (true) {
                Socket incoming = s.accept();
                inFromClient = new ObjectInputStream(incoming.getInputStream());
                outToClient = new ObjectOutputStream(incoming.getOutputStream());
                System.out.println("Client connected at " + t.getTime());
                client_count++;
                System.out.println("client count :" + client_count);
                String client_type = (String) (inFromClient.readObject());
                if (client_type.equalsIgnoreCase("customer")) {
                    p01 = customer();

                } else {

                }

                
                System.out.println("Array list size :    " + Client_list.size());
                MtS = new MultithreadedServer(incoming, p01, inFromClient, outToClient, client_count, this);
                mts_list.add(MtS);
                System.out.println("----------------------------");
                System.out.println("Multi threaded server started");
                MtS.start();
//            fw = new FileWriter(Customerdb_log.getAbsoluteFile(), true);
//            w = new BufferedWriter(fw);
//            customer_stream1 = (Customer)(inFromClient.readObject());          

            }
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Connection Error");
        }

    }

    public void send_message_client(String msg) {
        for (MultithreadedServer m : mts_list) {
            m.send_message(msg);
        }
    }

    public Customer customer() {
        Customer customer = new Customer("end", "end", "end", "end", "end", "end", "end", "end", "end");
        try {
            System.out.println("---------------inside customer-----------");
            fw = new FileWriter(Customerdb_log.getAbsoluteFile(), true);
            w = new BufferedWriter(fw);

            System.out.println("finsihed buffer writter");
            customer_count++;
            System.out.println(" Customer count is   :" + customer_count);
            
            System.out.println("trying to read customer object");
            customer = (Customer) (inFromClient.readObject());
            
            System.out.println("customer obj read");
            Customer_list.add(customer_count-1, customer);
            Client_list.add(client_count - 1, customer_stream1);
            System.out.println(customer.getCustomerID() + " " + customer.getFirstname() + " " + customer.getLast_name() + " " + customer.getAddress());
            w.write(customer.getCustomerID() + " " + customer.getFirstname() + " " + customer.getLast_name() + " " + customer.getAddress());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
        
            try {w.close();}
            catch (Exception e){ e.printStackTrace();}
        }
        return customer;
    }

    public void supplier() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
