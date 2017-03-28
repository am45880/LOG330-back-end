package com.rrq.repositories;

import com.rrq.model.Camionneur;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yassine on 2017-03-27.
 */
public interface CamionneursRepository extends MongoRepository<Camionneur,String> {

    public Camionneur findByUtilisateur(String utilisateur);

    public void deleteByUtilisateur(String utilisateur);

}
