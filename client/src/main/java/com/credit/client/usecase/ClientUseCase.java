package com.credit.client.usecase;

import com.credit.client.dto.ClientDTO;
import com.credit.client.infrastructure.postgres.ClientDataOperations;
import org.springframework.stereotype.Component;

@Component
public class ClientUseCase {
    private ClientDataOperations dataOperations;

    public ClientUseCase(ClientDataOperations dataOperations) {
        this.dataOperations = dataOperations;
    }

    public void createClient(ClientDTO dto) {
        dataOperations.createClient(dto);
    }

    public ClientDTO findClient(String id) {
        return dataOperations.findClient(id);
    }
}
