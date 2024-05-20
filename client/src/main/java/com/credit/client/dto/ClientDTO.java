package com.credit.client.dto;

import java.math.BigInteger;

public record ClientDTO(
        String id,
        String name,
        BigInteger debit
) {
}
