package com.example.apicall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;

@Component
public class APICall {

public String getResponseFromAPI (String apiUrl, String authHeader, String type) {
try {

        //URL url = new URL("https://apisandbox.openbankproject.com/my/logins/direct");
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(type);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", authHeader);
        if (conn.getResponseCode() != 200 && conn.getResponseCode() != 201) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        StringBuilder sb = new StringBuilder();
        String token;
        while ((token = br.readLine()) != null) {
        sb.append(token+"\n");
        }
/*
* String value = token.substring(1, token.length()-1); //remove curly brackets
* String[] keyValuePairs = value.split(":"); String trimmedToken =
* keyValuePairs[1].substring(1, keyValuePairs[1].length()-1); return
* trimmedToken;
*/
   
               
        conn.disconnect();
        return sb.toString();

    } catch (Exception e) {
    e.printStackTrace();
        System.out.println("Exception in NetClientGet:- " + e);
       
    }
return null;
}
}
