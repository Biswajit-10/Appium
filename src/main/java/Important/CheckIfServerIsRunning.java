package Important;

import java.io.IOException;
import java.net.ServerSocket;

public class CheckIfServerIsRunning {

	public static void main(String[] args) {
		 
		 boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(4723);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
		 System.out.println(isServerRunning);
	}
	

}
