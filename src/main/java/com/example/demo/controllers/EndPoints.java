package com.example.demo.controllers;

import com.example.demo.services.CatFact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.services.CatServices;

import java.io.IOException;
import java.util.ArrayList;

@Controller
public class EndPoints {
    CatServices catObj = new CatServices();
    @GetMapping("/")
    @ResponseBody
    public String frontPage(){

        return "Welcome";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        CatServices catObj = new CatServices();

        String data = catObj.fetchData();


        return data;
    }

    @GetMapping("/getTen")
    @ResponseBody
    public ArrayList<CatFact> getTen() throws IOException {

        CatServices catObj2 = new CatServices();

        ArrayList<CatFact> data = catObj2.multiFetchData();

        data = catObj2.multiFetchData();

        System.out.println(data);
        return data;
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public ArrayList<CatFact> getTenSortByDate() throws IOException {
        CatServices catObj3 = new CatServices();

        ArrayList<CatFact> data = catObj3.multiFetchData();

        data = catObj3.multiFetchData();
        data.sort(CatFact::compareTo);

        System.out.println(data);
        return data;

    }

    @GetMapping("/contains")
    @ResponseBody
    public String contains(@RequestParam char x, @RequestParam int n) throws IOException {
        CatFact c = catObj.getOne();

        int count = 0;


        for(int i = 0; i < c.getText().length(); i++){
            if(c.getText().toLowerCase().charAt(i) == x){
                count++;
                //System.out.println(c.getText().charAt(i));
            }
        }
        System.out.println(count);

        if(count == n){
            return c.getText();
        }else {
            return ("Sorry No Luck");

        }
    }
}
