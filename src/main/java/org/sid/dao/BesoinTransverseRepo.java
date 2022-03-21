package org.sid.dao;

import org.sid.entities.BesoinTransverse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource 
public interface BesoinTransverseRepo extends JpaRepository<BesoinTransverse,Integer>{

}
