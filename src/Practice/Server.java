package Practice;
import java.net.*;
import java.io.*;
/**
 * A Server Program
 * @author arka
 * @version 4 March 2016
 */
public class Server extends Thread{

	private ServerSocket serverSocket;
	/**
	 * constructor method
	 */
	public Server(int port)throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}
	/**
	 * @see run() in Thread class
	 */
	public void run(){
		while(true){
			try{
				System.out.println("Waiting for client on port " +serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("Just connected to "+ server.getRemoteSocketAddress());
				
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
	            DataOutputStream out = new DataOutputStream(server.getOutputStream());
	            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!");
	            server.close();
			}catch(SocketTimeoutException e){
				System.out.println("Socket timed out!");
	            break;
			}catch(IOException e){
				e.printStackTrace();
				break;
			}
		}
	}
	/**
	 * Driver method
	 * @param args
	 */
	public static void main(String [] args){
	     int port = Integer.parseInt(args[0]);
	     try{
	        Thread thread = new Server(port);
	        thread.start();
	     }catch(IOException e){
	        e.printStackTrace();
	     }
	  }
}
