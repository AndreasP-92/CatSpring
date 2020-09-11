package com.example.demo.services;

import com.example.demo.services.CatFact;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class  CatServices {
    public String fetchData() throws IOException {
        //Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        //Map the data from Json to an object
        CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
        //Close the BufferedReader
        inputFromCatURL.close();
        String test = data.toString();

        return test;
//        System.out.println(data.toString());
    }
}
