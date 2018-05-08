package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(5678);
		// ss.bind(null);
		System.out.println("Inainte de accept");
		Socket socket = ss.accept();
		System.out.println("Dupa accept");
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		socket.close();
		System.out.println("Gata");
	}

}
