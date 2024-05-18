package org.credit.client.adapters;

import org.credit.client.dto.ClientDTO;
import org.credit.client.entrypoint.request.ClientCreateRequest;

public class CreateRequestToDTOAdapter {
    public static ClientDTO adapt(ClientCreateRequest request) {
        return new ClientDTO(
                request.id(),
                request.name()
        );
    }
}
