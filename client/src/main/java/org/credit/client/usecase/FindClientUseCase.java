package org.credit.client.usecase;

import org.credit.client.dto.ClientDTO;

public class FindClientUseCase {
    public static ClientDTO findClient(String id) {
        System.out.println("Finding client");
        return new ClientDTO(
                id,
                "Marcelo"
        );
    }
}
