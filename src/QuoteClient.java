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
            String quote;
            //creates the socket so we can connect to the port that the server has opened
            Socket socket = new Socket("127.0.0.1", 6013);

            //receive the output from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //read the output from server within inputStream
            while((quote = in.readLine()) != null){
                System.out.println(quote);
            }

            //close the socket
            //close the stream
            socket.close();
            in.close();



        }
        catch(UnknownHostException err){
            System.out.println(err);

        }

        catch(IOException ioe){
            System.out.println(ioe);
        }

    }
}
