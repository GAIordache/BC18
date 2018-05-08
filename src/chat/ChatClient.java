package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("127.0.0.1", 5678);
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		pw.println("Salut");
		pw.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("\n>>");
			String line = br.readLine();
			if (line == null || "exit".equalsIgnoreCase(line)) {
				break;
			}
			pw.println(line);
			pw.flush();
		}

		pw.close();
		socket.close();
	}

}
