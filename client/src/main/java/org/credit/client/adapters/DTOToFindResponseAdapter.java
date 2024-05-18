package org.credit.client.adapters;

import org.credit.client.dto.ClientDTO;
import org.credit.client.entrypoint.response.ClientFindResponse;

public class DTOToFindResponseAdapter {
    public static ClientFindResponse adapt(ClientDTO dto) {
        return new ClientFindResponse(
                dto.id(),
                dto.name()
        );
    }
}
