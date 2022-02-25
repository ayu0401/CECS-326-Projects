/**
 * Quote server listening to port 6017.
 *
 */
 
import java.net.*;
import java.io.*;

public class QuoteServer
{
    public static void main(String[] args) {
        try{
            // Starts server and waits for a connection
            ServerSocket server = new ServerSocket(6017);

            System.out.println("Server has started up!");
            System.out.println("Waiting for client...");

            while(true){
                Socket socket = server.accept();

                System.out.println("Client has been accepted");

                //server is going to send a quote into the socket

                PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);

                pout.println("Hi everybody this is the quote of the day");

                // close the sockets connection

                socket.close();
            }

        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }

}
