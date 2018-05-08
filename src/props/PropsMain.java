package props;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropsMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream(new File("config.properties")));
		String ipServer = props.getProperty("ip_server");
		System.out.println(ipServer);
		System.out.println(props);

	}

}
