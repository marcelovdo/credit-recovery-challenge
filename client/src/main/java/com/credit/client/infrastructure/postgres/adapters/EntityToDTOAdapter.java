package com.credit.client.infrastructure.postgres.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.infrastructure.postgres.entity.Client;

public class EntityToDTOAdapter {
    public static ClientDTO adapt(Client client) {
        return new ClientDTO(client.getId(), client.getName());
    }
}
