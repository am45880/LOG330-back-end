package com.rrq.controllers;

import com.rrq.model.Camionneur;
import com.rrq.repositories.CamionneursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yassine on 2017-03-27.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
    public void addCamionneur(@ModelAttribute Camionneur camionneur){
        camionneursRepository.insert(camionneur);
    }

    @RequestMapping(value="/delete",method = RequestMethod.POST)
    public void deleteCamionneur(@RequestParam String utilisateur){
        this.camionneursRepository.deleteByUtilisateur(utilisateur);
    }

    @RequestMapping(value="/all",method = RequestMethod.DELETE)
    public void deleteAllCamionneur(){
        camionneursRepository.deleteAll();
    }



    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Camionneur> getAll(){
        return camionneursRepository.findAll();
    }


    @RequestMapping(value = "/init",method = RequestMethod.GET)
    public String initCamionneurs(){
        camionneursRepository.deleteAll();

        List<Camionneur> camionneurs = new ArrayList<Camionneur>();

        camionneurs.add(new Camionneur("Backo","End","bend","lolo"));
        camionneurs.add(new Camionneur("Tim","Cook","apple","croco"));
        camionneurs.add(new Camionneur("Steve","Job","iphone","California"));

        camionneursRepository.save(camionneurs);

        return "Les camionneurs ont ete ajoutes.";
    }

}
