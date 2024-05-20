package com.credit.client.entrypoint.adapters;

import com.credit.client.dto.ClientDTO;
import com.credit.client.entrypoint.request.ClientMessage;

public class MessageToDTOAdapter {
    public static ClientDTO adapt(ClientMessage message) {
        return new ClientDTO(message.id(), message.name(), message.debit());
    }
}
