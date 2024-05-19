package com.credit.client.infrastructure.postgres.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.infrastructure.postgres.entity.Client;

public class DTOToEntityAdapter {
    public static Client adapt(ClientDTO dto) {
        return new Client(dto.id(), dto.name());
    }
}
