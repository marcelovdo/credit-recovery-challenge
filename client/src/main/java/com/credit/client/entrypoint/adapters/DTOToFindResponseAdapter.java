package com.credit.client.entrypoint.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.response.ClientFindResponse;

public class DTOToFindResponseAdapter {
    public static ClientFindResponse adapt(ClientDTO dto) {
        return new ClientFindResponse(
                dto.id(),
                dto.name()
        );
    }
}
