package org.credit.client.adapters;

import org.credit.client.dto.ClientDTO;
import org.credit.client.entrypoint.response.ClientCreateResponse;

public class DTOToCreateResponseAdapter {
    public static ClientCreateResponse adapt(ClientDTO dto) {
        return new ClientCreateResponse(
                dto.id(),
                "Client successfully created."
        );
    }
}
