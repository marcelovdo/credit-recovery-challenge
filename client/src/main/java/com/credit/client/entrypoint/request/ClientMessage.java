package com.credit.client.entrypoint.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.credit.client.exception.BadRequestException;

import java.math.BigInteger;

public record ClientMessage(
        String id,
        String name,
        BigInteger debit
) {
    public static ClientMessage parseMessage(String message) {
        try {
            return new ObjectMapper().readValue(message, ClientMessage.class);
        } catch(JsonProcessingException e) {
            throw new BadRequestException("Error processing JSON message");
        }
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + debit;
    }
}
