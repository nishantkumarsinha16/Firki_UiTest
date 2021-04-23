package com.DataProvider;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

import Com.ReadUtility.UtilityClass;

public class TestDataProvider {

	UtilityClass utility;

	@DataProvider(name = "dp")
	public String[] userLoginData() throws IOException, ParseException {
		File file = new File(System.getProperty("user.dir") + "/data/userdetail.json");
//		JSONParser jparser = new JSONParser();
//		FileReader reader = new FileReader(file);
//		Object obj = jparser.parse(reader);
//		JSONObject userLoginJsonObj = (JSONObject) obj;
//		JSONArray userLoginArray = (JSONArray) userLoginJsonObj.get("userlogins");
		JSONArray userLoginArray = UtilityClass.readJson(file, "userlogins");
		String arr[] = new String[userLoginArray.size()];
		for (int i = 0; i < userLoginArray.size(); i++) {
			JSONObject users = (JSONObject) userLoginArray.get(i);
			String user = (String) users.get("username");
			String psw = (String) users.get("password");
			arr[i] = user + "," + psw;

		}
		return arr;

	}

	@DataProvider(name = "propFile")
	public Object[][] userLogin() throws IOException {

		File file = new File(System.getProperty("user.dir") + "/data/config.properties");
		Object[][] creds = new Object[1][2];
		creds[0][0] = UtilityClass.readProperty(file, "user_email");
		creds[0][1] = UtilityClass.readProperty(file, "password");

		return creds;

	}

}
