package com.credit.client.adapters;

import com.credit.client.entrypoint.response.ClientCreateResponse;
import com.credit.client.dto.ClientDTO;

public class DTOToCreateResponseAdapter {
    public static ClientCreateResponse adapt(ClientDTO dto) {
        return new ClientCreateResponse(
                dto.id(),
                "Client successfully created."
        );
    }
}
