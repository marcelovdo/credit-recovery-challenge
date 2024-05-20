package com.credit.client.entrypoint.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.request.ClientCreateRequest;

public class CreateRequestToDTOAdapter {
    public static ClientDTO adapt(ClientCreateRequest request) {
        return new ClientDTO(
                request.id(),
                request.name(),
                request.debit()
        );
    }
}
