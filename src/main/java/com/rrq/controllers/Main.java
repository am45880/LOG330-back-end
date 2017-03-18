package com.rrq.controllers;

import com.rrq.model.Camionneur;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yassine on 2017-03-17.
 */
//test
@RestController
@RequestMapping("/")
public class Main {

    Camionneur camioneurs[]={
            new Camionneur("Backo","End","bend","lolo"),
            new Camionneur("Tim","Cook","apple","croco"),
            new Camionneur("Steve","Job","iphone","California")};


    @RequestMapping
    public Camionneur[] welcom(){
         return camioneurs;
    }

}
