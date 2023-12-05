package com.mindhub.demo.Repositories;

import com.mindhub.demo.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepositories extends JpaRepository<Client, Long> {


}
