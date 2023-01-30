package commonUtils;



import java.util.Properties;

public class ConfigFileReader {
	
	private Properties prop;
	private final String propertyFilePath = System.getProperty("user.dir")
			+ "/src/main/resources/config.properties";
	
	public String getConfigFileElement(String name) throws Exception {
		
		Properties props = new Properties();
		props.load(ConfigFileReader.class.getClassLoader().getResourceAsStream("config.properties"));
		return props.getProperty(name);

	}

}
