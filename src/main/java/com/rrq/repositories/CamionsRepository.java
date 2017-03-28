package com.rrq.repositories;

import com.rrq.model.Camion;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yassine on 2017-03-27.
 */
public interface CamionsRepository extends MongoRepository<Camion,String> {

    public Camion findByNom(String nom);

    public void deleteByNom(String nom);
}
