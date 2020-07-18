package org.cid.catservice.dao;

import org.cid.catservice.entities.Produit;

import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long> {
@RestResource(path="/byDesignation")
public List<Produit> findByDesignationContains( @ Param("mc") String des);

    @RestResource(path="/byDesignationPage")
    public Page<Produit> findByDesignationContains(@ Param("mc") String des, Pageable pageable);

}
