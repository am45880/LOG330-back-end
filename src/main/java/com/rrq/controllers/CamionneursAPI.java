package com.rrq.controllers;

import com.rrq.model.Camionneur;
import com.rrq.repositories.CamionneursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yassine on 2017-03-27.
 */
@RestController
@RequestMapping(value = "/camionneur")
public class CamionneursAPI {

    @Autowired
    CamionneursRepository camionneursRepository;

    //Primary Verbs

    @RequestMapping(method = RequestMethod.GET)
    public Camionneur selectCamionneur(@RequestParam String utilisateur){
        return camionneursRepository.findByUtilisateur(utilisateur);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCamionneur(@ModelAttribute Camionneur utilisateur, @RequestParam String nom){
        camionneursRepository.insert(utilisateur);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCamionneur(@RequestParam String utilisateur){
        camionneursRepository.deleteByUtilisateur(utilisateur);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Camionneur> getAll(){
        return camionneursRepository.findAll();
    }

    //Util API

    @RequestMapping(value = "/auth",method = RequestMethod.DELETE)
    public String authenticate(@RequestParam String utilisateur , @RequestParam String motDePasse){
        Camionneur camionneur = camionneursRepository.findByUtilisateur("Utilisateur");
        if(motDePasse.equals(camionneur.getMotDePasse())){
            return "success";
        }else {
            return "false";
        }
    }

}
