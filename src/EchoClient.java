/**
 * An echo client. The client enters data to the server, and the
 * server echoes the data back to the client.
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class EchoClient
{
    public static void main(String[] args) {
        try{
            //let's create the client side socket
            Socket clientSocket = new Socket("127.0.0.1", 6007);

            System.out.println("Client has started up!");

            //create the input and output streams for the client
            PrintWriter pout = new PrintWriter(clientSocket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            //create scanner for userInput so we can send strings or data to server
            Scanner sc = new Scanner(System.in);

            //User sends message to the server
            while(true){
                //this loop basically just sends messages to the server, and reads the echo back from server
                System.out.println("Send a message to the server: ");
                String userIn = sc.nextLine();

                //the exit code is: STOP --> used to stop the code from running
                if(userIn.equals("STOP")){
                    break;
                }
                pout.println(userIn);
                String inputStream = in.readLine();
                System.out.println(inputStream);
            }


            //close the client socket and the input/output streams
            clientSocket.close();
            pout.close();
            in.close();

        }
        catch (IOException ioe){
            System.out.println(ioe);
        }


    }
}
