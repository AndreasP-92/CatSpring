package com.example.demo.services;

import com.google.gson.Gson;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

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
        String dataResult = data.toString();

        return dataResult;
//        System.out.println(data.toString());
    }

    public ArrayList<CatFact> multiFetchData() throws IOException {
        //Choose what API to consume
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        for(int i = 0; i > 10; i++){

        }
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL2 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL3 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL4 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL5 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL6 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL7 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL8 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL9 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        BufferedReader inputFromCatURL10 = new BufferedReader(new InputStreamReader(catURL.openStream()));
        //Map the data from Json to an object
//        List<Integer> list = new Arrays.asList(10,20);
        ArrayList<CatFact> arr = new ArrayList<CatFact>(

        );

        arr.add(new Gson().fromJson((Reader) inputFromCatURL, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL2, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL3, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL4, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL5, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL6, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL7, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL8, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL9, (Type) CatFact.class));
        arr.add(new Gson().fromJson((Reader) inputFromCatURL10, (Type) CatFact.class));

        inputFromCatURL.close();


        return arr;
//        System.out.println(data.toString());
    }

    public CatFact getOne() throws IOException {
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        //Instantiate a Buffered Reader to consume the InputStream from the URL
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));

        return ( new Gson().fromJson((Reader) inputFromCatURL, (Type) CatFact.class));

    }
}
