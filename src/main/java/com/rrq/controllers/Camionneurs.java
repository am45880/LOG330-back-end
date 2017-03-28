package com.rrq.controllers;

import com.rrq.model.Camionneur;
import com.rrq.repositories.CamionneursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yassine on 2017-03-27.
 */
@RestController
@RequestMapping(value = "/camionneurs")
public class Camionneurs {

    @Autowired
    CamionneursRepository camionneursRepository;

    //Primary verb

    @RequestMapping(method = RequestMethod.GET)
    public Camionneur selectCamionneur(@RequestParam String utilisateur){
        return camionneursRepository.findByUtilisateur(utilisateur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCamionneur(@RequestParam Camionneur utilisateur){
        camionneursRepository.insert(utilisateur);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCamionneurdw(@RequestParam String utilisateur){
        camionneursRepository.deleteByUtilisateur(utilisateur);
    }


    //Util API

    @RequestMapping(value = "/auth",method = RequestMethod.DELETE)
    public boolean authenticate(@RequestParam String utilisateur , @RequestParam String mot){

        return true;

    }



}
