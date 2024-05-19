package com.credit.client.infrastructure.postgres;

import com.credit.client.dto.ClientDTO;
import com.credit.client.infrastructure.postgres.adapters.DTOToEntityAdapter;
import com.credit.client.infrastructure.postgres.adapters.EntityToDTOAdapter;
import com.credit.client.infrastructure.postgres.entity.Client;
import com.credit.client.infrastructure.postgres.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientDataOperations {
    private final ClientRepository repository;

    @Autowired
    public ClientDataOperations(ClientRepository repository) {
        this.repository = repository;
    }

    public void createClient(ClientDTO dto) {
        Client client = DTOToEntityAdapter.adapt(dto);
        repository.save(client);
    }

    public ClientDTO findClient(String id) {
        Optional<Client> opClient = repository.findById(id);
        return opClient.map(EntityToDTOAdapter::adapt).orElseGet(() -> new ClientDTO("", ""));
    }

    public void updateClient(ClientDTO dto) {
        createClient(dto);
    }
}
