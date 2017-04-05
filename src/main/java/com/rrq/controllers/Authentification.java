package com.rrq.controllers;

import com.rrq.model.Camionneur;
import com.rrq.repositories.CamionneursRepository;
import com.rrq.repositories.CamionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rachid, Mohamed Yassine on 2017-04-04.
 */
@RestController
@RequestMapping("auth")
public class Authentification {

    @Autowired
    CamionneursRepository camionneursRepository;

    @RequestMapping("/login")
    public String login(@RequestParam String utilisateur,@RequestParam String motDePasse){

        Camionneur camionneur = camionneursRepository.findByUtilisateur(utilisateur);

        if(camionneur != null && camionneur.getMotDePasse().equals(motDePasse)){
            return "success";
        }else {
            return "fail";
        }

    }
}
