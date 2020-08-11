package org.cid.catservice;

import org.cid.catservice.dao.ProduitRepository;
import org.cid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {
@Autowired
    private ProduitRepository produitRepository;
@Autowired
private RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Produit.class);
        produitRepository.save(new Produit(null,"lenovo 1",1,10));
        produitRepository.save(new Produit(null,"lenovo 2",2,20));
        produitRepository.save(new Produit(null,"lenovo 3",3,30));


        System.out.println("hello");
produitRepository.findAll().forEach(p->{
    System.out.println(p.toString());


});
        System.out.println("hello worldddddddddd");
        System.out.println("hello l3alaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaam");
    }
}
