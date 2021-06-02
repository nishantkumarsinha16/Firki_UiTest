package Com.ReadUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.path.json.JsonPath;

public class Utils {

	public static JSONArray readJson(File file, String key) throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(file);
		Object obj = jsonParser.parse(reader);
		JSONObject jsonObj = (JSONObject) obj;
		JSONArray jsonArray = (JSONArray) jsonObj.get(key);
		return jsonArray;

	}

	public static String readProperty(File FILENAME, String KEYNAME) throws IOException {
		Properties prop = new Properties();
		// File file = new File(System.getProperty("user,dir") + "/data/"+FILENAME);
		FileReader reader = new FileReader(FILENAME);
		prop.load(reader);
		String key = prop.getProperty(KEYNAME);
		return key;

	}

	public static String readProp(File FILENAME, String KEYNAME) {
		String key = "";
		Properties prop = new Properties();
		// File file = new File(System.getProperty("user,dir") + "/data/"+FILENAME);
		FileReader reader;
		try {
			reader = new FileReader(FILENAME);
			prop.load(reader);
			key = prop.getProperty(KEYNAME);
		} catch (FileNotFoundException e) {
			System.out.println("prop file not found");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("prop file not found");
		}

		return key;

	}

	public static String readJsonFile(String key) {
		JsonPath jsonPath = new JsonPath(new File(System.getProperty("user.dir") + "/data/userdetail.json"));
		String value = jsonPath.get(key) + "";
		return value;
	}

}
