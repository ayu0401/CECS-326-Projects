/**
 * An echo server listening on port 6007. This server reads from the client
 * and echoes back the result. 
 */

import java.net.*;
import java.io.*;

public class  EchoServer
{
    public static void main(String[] args) {
        try{
            //we are creating a server side socket
            ServerSocket echoServer =  new ServerSocket(6007);

            System.out.println("Server has started up! It is now RUNNING");
            System.out.println("Waiting for the client connection...");


            while(true){
                //listening for the client, accepting the client through .accept() method
                Socket socket = echoServer.accept();
                System.out.println("Client was accepted and has been connected!");

                //create input and output streams
                //pout is for sending messages or data out to the client
                PrintWriter pout = new PrintWriter(socket.getOutputStream(), true);
                //"in" is used for reading the inputs that come into the EchoServer
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));


                System.out.println("Waiting for Client to say something....");
                //create a String object to hold the input coming in form client side
                String inputStream;
                //Read the input
                while((inputStream = in.readLine()) != null){
                    System.out.println(inputStream);
                    pout.println("Echo!! Server Says: " + inputStream);

                }

                //close the server socket and the input/output streams
                echoServer.close();
                pout.close();
                in.close();
            }
        }
        catch (IOException ioe){
            System.out.println(ioe + " The Client must have disconnected or a big IOException has occurred!");
        }
    }
}
