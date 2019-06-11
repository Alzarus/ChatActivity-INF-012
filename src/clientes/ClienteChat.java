/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author pedroalmeida
 */
public class ClienteChat {
    private Socket socket;
    private String msgReceived;
    
    public void setConnection(String ip, int porta) throws Exception {
        this.socket = new Socket(ip, porta);
    }
    
    public void closeConnection() throws Exception {
        this.socket.close();
    }
    
    public void sendMsg(String msg) throws Exception {
        Thread.sleep(1000); 
        OutputStream os = this.socket.getOutputStream();
        PrintWriter out = new PrintWriter(os,true);//Filtro de Escrita 
        out.println(msg);//Envia a mensagem 
        
        out.close();
        os.close();
        this.socket.close();
    }
    
    public void receiveMsg(){
        
    }
  
    
}
