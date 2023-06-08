package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility {

    public String dataFetcher(String key) throws IOException {
        String location = System.getProperty("user.dir");
        FileInputStream file = new FileInputStream(location+"/src/main/resources/propertyFiles/dataSaver.properties");
            Properties reader = new Properties();
            reader.load(file);
            String value = reader.getProperty(key);
            return value;
 
        }
        
    }