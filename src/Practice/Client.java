package Practice;
import java.io.*;
import java.net.*;
/**
 * A Client program
 * @author arka
 * @version 4 March 2016
 */
public class Client {

	public static void main(String args[]){
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try{
			System.out.println("Connecting to " + serverName +" on port " + port);
			Socket client = new Socket( serverName, port);
			System.out.println("Connected to "+ client.getRemoteSocketAddress());
			
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Message from client : "+ client.getLocalSocketAddress());
			
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Message from server : "+ in.readUTF());
			
			client.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
