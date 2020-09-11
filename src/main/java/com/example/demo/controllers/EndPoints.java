package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.demo.services.CatServices;

import java.io.IOException;

@Controller
public class EndPoints {
    @GetMapping("/")
    @ResponseBody
    public String frontPage(){

        return "Welcome";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingle() throws IOException {
        CatServices catObj = new CatServices();

        String test = catObj.fetchData();


        return test;
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTen(){
        return "asd";
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String getTenSortByDate(){
        return "asd";
    }

    @GetMapping("/contains")
    @ResponseBody
    public String contains(){
        return "asd";
    }
}
