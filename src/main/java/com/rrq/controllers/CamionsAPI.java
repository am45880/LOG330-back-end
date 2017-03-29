package com.rrq.controllers;

import com.rrq.model.Camion;
import com.rrq.model.PointTrajet;
import com.rrq.repositories.CamionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Rachid, Mohamed Yassine on 2017-03-27.
 */
@RestController
@RequestMapping(value = "/camion")
public class CamionsAPI {

    @Autowired
    CamionsRepository camionsRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Camion selectCamion(@RequestParam String nom){
        return camionsRepository.findByNom(nom);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addCamion(@ModelAttribute Camion nom){
        camionsRepository.insert(nom);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCamion(@RequestParam String nom){
        camionsRepository.deleteByNom(nom);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Camion> getAll(){

        return camionsRepository.findAll();
    }

    // Access to the trajet

    @RequestMapping(value = "/trajet",method = RequestMethod.PUT)
    public void modifTrajet(@ModelAttribute List<PointTrajet> trajet, @RequestParam String nom){
        Camion camionAModif = camionsRepository.findByNom(nom);
        camionAModif.setTrajet(trajet);
        camionsRepository.save(camionAModif);
    }

    @RequestMapping(value = "/trajet",method = RequestMethod.POST)
    public void addPointTrajet(@ModelAttribute PointTrajet pointTrajet, @RequestParam String nom){
        Camion camionAModif = camionsRepository.findByNom(nom);
        camionAModif.getTrajet().add(pointTrajet);
        camionsRepository.save(camionAModif);
    }

}
