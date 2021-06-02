package com.Pages;

import java.io.IOException;
import com.Loactors.iFilePath;
import com.google.gson.JsonObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import Com.ReadUtility.Utils;

public class Demo implements iFilePath {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ParseException {

        // List<String> list = new ArrayList<String>();
        JSONArray userArray = Utils.readJson(json, "userlogins");
        JSONArray array = Utils.readJson(json, "group_details");
        JSONObject user = (JSONObject) userArray.get(0);
        for (int i = 0; i < array.size(); i++) {
            JSONObject data = (JSONObject) array.get(i);
            data.put("name", user.get("username"));
            System.out.println(data.get("name"));
        }

        // System.out.println(data);

        // JSONArray msg = (JSONArray) data.get("name");
        // System.out.println(msg);

        // for (int j = 0; j < msg.size(); j++) {
        // System.out.println(msg.get(j));

        // }
        // String psw = (String) data.get("password");
        // list.add(msg);
        // list.add(psw);

        // }

        // for (String i : list) {
        // System.out.println(i);
        // }

    }

}
