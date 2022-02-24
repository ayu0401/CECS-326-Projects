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
            ServerSocket sock = new ServerSocket(6017);

            /*now listen for connections */

            while(true){
                Socket client = sock.accept(); //trying to accept the port 6017

                PrintWriter pout = new PrintWriter(client.getOutputStream(), true);


                /* write the Date to the socket */

                pout.println("this project aint bussin man....");


                /*close the socket and resume */
                /* listen for connection */

                client.close();


            }
        }

        catch(IOException ioe){
            System.err.println(ioe);
        }
    }

}
