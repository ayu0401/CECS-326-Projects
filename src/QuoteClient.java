/**
 * Modified DateClient so that it requests a quote
 * from the quote server.
 */
 
import java.net.*;
import java.io.*;

public class QuoteClient
{
	//Your code is here
    public static void main(String[] args) {
        try{
            //creates the socket so we can connect to the port that the server has opened
            Socket socket = new Socket("127.0.0.1", 6017);

            //get the input that was put into the socket

        }
        catch(UnknownHostException err){
            System.out.println(err);

        }

        catch(IOException ioe){
            System.out.println(ioe);
        }

    }
}
