package com.credit.client.entrypoint.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.request.ClientCreateRequest;
import com.credit.client.entrypoint.request.ClientUpdateRequest;

public class UpdateRequestToDTOAdapter {
    public static ClientDTO adapt(ClientUpdateRequest request, String id) {
        return new ClientDTO(
                id,
                request.name()
        );
    }
}
