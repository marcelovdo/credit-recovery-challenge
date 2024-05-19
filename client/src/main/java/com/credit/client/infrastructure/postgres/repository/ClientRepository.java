package com.credit.client.infrastructure.postgres.repository;

import com.credit.client.infrastructure.postgres.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, String> {
}
