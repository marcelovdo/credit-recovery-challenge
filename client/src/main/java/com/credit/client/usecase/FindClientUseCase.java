package com.credit.client.usecase;

import com.credit.client.dto.ClientDTO;

public class FindClientUseCase {
    public static ClientDTO findClient(String id) {
        System.out.println("Finding client");
        return new ClientDTO(
                id,
                "Marcelo"
        );
    }
}
