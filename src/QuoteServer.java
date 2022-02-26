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
            ServerSocket server = new ServerSocket(6013);

            System.out.println("Server has started up!");
            System.out.println("Waiting for client...");

            while(true){
                Socket socket = server.accept();

                System.out.println("Client has been accepted");

                //server is going to send a quote into the socket
                //you open up a output stream
                PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);

                //this is the quote of the day, can be whatever you want
                String quoteDay = "Project#1 was a little hard";

                pout.println(quoteDay);


                // close the sockets connection
                //close stream(s)
                socket.close();
                pout.close();

            }

        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }

}
