package com.rrq.controllers;

import com.rrq.model.Camion;
import com.rrq.model.Camionneur;
import com.rrq.model.PointTrajet;
import com.rrq.repositories.CamionneursRepository;
import com.rrq.repositories.CamionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yassine on 2017-03-27.
 */
@RestController
@RequestMapping(value = "/data")
public class Data {

    ////////******************* Control Camions **************/////////////////////

    @Autowired
    CamionsRepository camionsRepository;

    @RequestMapping(value = "init_camions")
    public String initCamions(){
        camionsRepository.deleteAll();
        
        List<Camion> camions = new ArrayList<Camion>();
        
        Camion camion1= new Camion("Rapide","Mercedez","PXF-894",new ArrayList<PointTrajet>());
        camion1.getTrajet().add(new PointTrajet("Pommes","J5X-8B7","1:40",1));
        camion1.getTrajet().add(new PointTrajet("Clavier","K5J-8T7","1:30",3));
        camion1.getTrajet().add(new PointTrajet("Ordinateur","K5G-8R2","1:00",2));
        camions.add(camion1);

        Camion camion2= new Camion("Amenagement","Honda","HTD-749",new ArrayList<PointTrajet>());
        camion2.getTrajet().add(new PointTrajet("Bureau","J5X-8B7","1:00",1));
        camion2.getTrajet().add(new PointTrajet("Chaise","K5J-8T7","1:04",2));
        camion2.getTrajet().add(new PointTrajet("Tapis","K5G-8R2","0:50",3));
        camions.add(camion2);

        camionsRepository.save(camions);
        
        return "Les camions ont ete ajoute";
    }

    @RequestMapping(value = "/delete_camions")
    public String deleteCamions(){
        camionsRepository.deleteAll();
        return "Les camions ont ete suprimes";
    }


    @RequestMapping(value = "/camions")
    public List<Camion> camions(){
        return camionsRepository.findAll();
    }


}
